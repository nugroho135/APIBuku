package com.example.iqbalAPI.apibuku.repositories;


import com.example.iqbalAPI.apibuku.entities.StatusBukuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StatusBukuRepository extends JpaRepository<StatusBukuEntity, Integer> {
//    List<StatusBukuEntity> findByStatusBuku(int status);
}
