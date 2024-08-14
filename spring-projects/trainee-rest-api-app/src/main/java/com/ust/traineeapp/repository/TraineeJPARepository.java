package com.ust.traineeapp.repository;

import com.ust.traineeapp.model.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface TraineeJPARepository extends JpaRepository<Trainee,Integer> {

    @Query("from Trainee where name like :name%")
    Trainee findByName(String name);

//    @Query("from Trainee where location=:location")
    List<Trainee> findByLocation(String location);

    boolean existsByName(String name);

}
