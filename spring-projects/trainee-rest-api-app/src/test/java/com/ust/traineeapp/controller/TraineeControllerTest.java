package com.ust.traineeapp.controller;

import com.ust.traineeapp.api.TraineeController;
import com.ust.traineeapp.model.Trainee;
import com.ust.traineeapp.service.TraineeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(TraineeController.class)
public class TraineeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    TraineeService traineeService;

    @Test
    public void testGetTrainee() throws Exception {
        // Given
        Trainee trainee = new Trainee(1, "Jabved", "Bangalore", null);

        // When
        Mockito.when(traineeService.getTrainee(1))
                .thenReturn(trainee);

        // Then
        mockMvc.perform(get("/api/trainees/1"))
                .andExpect(status().isOk())
                .andReturn();


    }

    @Test
    public void testAddTrainee() throws Exception {
        // Given
        Trainee trainee = new Trainee(1, "Javed", "Bangalore", null);

        // When
        Mockito.when(traineeService.addTrainee(trainee))
                .thenReturn(trainee);

        // Then
        mockMvc.perform(post("/api/trainees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                {
                                    "id":1,
                                    "name":"Javed",
                                    "location":"Bangalore"
                                }
                                """)
                )
                .andExpect(status().isCreated())
                .andReturn();


    }


}
