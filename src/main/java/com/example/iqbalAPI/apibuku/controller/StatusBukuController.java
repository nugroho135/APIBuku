package com.example.iqbalAPI.apibuku.controller;





import com.example.iqbalAPI.apibuku.entities.StatusBukuEntity;
import com.example.iqbalAPI.apibuku.repositories.StatusBukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/statusbuku")
public class StatusBukuController {

    @Autowired
    StatusBukuRepository statusbukuRepository;


//        @GetMapping(value = "getByStatus")
////    public List<StatusBukuEntity> getByStatus(@PathVariable(value="status") int status){
////        return statusbukuRepository.findByStatusBuku(status);
////    }

    @GetMapping(value = "getById")
    public StatusBukuEntity getById(@RequestParam int id){
        return statusbukuRepository.findById(id).get();
    }

    @PostMapping (value = "updateStatusBuku")
    public StatusBukuEntity updateStatusBuku (@RequestBody StatusBukuEntity param){
        return statusbukuRepository.save(param);
    }

    @PostMapping(value = "addNewStatusBuku" )
    public StatusBukuEntity addNewStatusBuku(@RequestBody StatusBukuEntity param){
        statusbukuRepository.save(param);
        return param;
    }
}
