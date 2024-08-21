package com.ust.traineeapp.service;

import com.ust.traineeapp.exception.RecordNotFoundException;
import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.repository.TraineeJPARepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;
@ExtendWith(SpringExtension.class)
public class TraineeServiceImplTest {
    @InjectMocks
    private TraineeServiceImpl traineeService;

    @Mock
    private TraineeJPARepository traineeRepo;

    @Test
    void testGetTrainee(){
        // Given
        Trainee t1 = new Trainee(1,"Karan","Bangalore",null);
        int id = 1;
        int invalidId = 100;
        // When
        Mockito.when(traineeRepo.findById(id))
                    .thenReturn(Optional.of(t1));

        Mockito.when(traineeRepo.findById(invalidId))
                .thenThrow(RecordNotFoundException.class);

        // Then

        Assertions.assertNotNull(traineeService.getTrainee(id));
        Assertions.assertThrows(RecordNotFoundException.class,
                        ()->traineeService.getTrainee(invalidId));

    }



}
