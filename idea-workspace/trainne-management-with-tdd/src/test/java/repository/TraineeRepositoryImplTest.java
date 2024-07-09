package repository;

import com.trmgapp.model.Trainee;
import com.trmgapp.repository.TraineeRepository;
import com.trmgapp.repository.TraineeRepositoryImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TraineeRepositoryImplTest {

    private TraineeRepositoryImpl traineeRepository;

    @BeforeEach
    public void setup(){

        List<Trainee> trainees = new ArrayList<>(
                List.of(
                        new Trainee(1,"Karan","karan@yahoo.com"),
                        new Trainee(2,"Rahul","rahul@yahoo.com"),
                        new Trainee(3,"Rohit","rohit@yahoo.com")
                )
        );

        traineeRepository = new TraineeRepositoryImpl(trainees);
    }

    @AfterEach
    public void tearDown(){
        traineeRepository=null;
    }

    @Test
    void testSave(){

        // Given
        Trainee trainee = new Trainee(10,"Javed","javed@yahoo.com");
        // When
        var savedTrainee = traineeRepository.save(trainee);
        // Then
        Assertions.assertEquals(trainee,savedTrainee);
        Assertions.assertNotNull(traineeRepository.findById(trainee.getId()));
    }

    @Test
    void testDelete(){
        // Given
        int id = 1;
        // When
        traineeRepository.delete(id);
        // Then
        Assertions.assertNull(traineeRepository.findById(id));
    }



}
