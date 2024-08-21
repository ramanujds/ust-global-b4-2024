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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

@SpringBootTest
public class TraineeServiceImplIntegrationTest {
    @Autowired
    private TraineeServiceImpl traineeService;


    @Test
    void testGetTrainee(){
        // Given
        int id = 1;
        int invalidId = 100;

        Assertions.assertNotNull(traineeService.getTrainee(id));
        Assertions.assertThrows(RecordNotFoundException.class,
                        ()->traineeService.getTrainee(invalidId));

    }



}
