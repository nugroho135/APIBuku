package com.example.iqbalAPI.apibuku.repositories;

import com.example.iqbalAPI.apibuku.entities.BukuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BukuRepository extends JpaRepository<BukuEntity, Integer> {

}
