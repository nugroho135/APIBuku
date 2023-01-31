package com.example.iqbalAPI.apibuku.controller;

import com.example.iqbalAPI.apibuku.entities.BukuEntity;
import com.example.iqbalAPI.apibuku.repositories.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/buku")
public class BukuController {

    @Autowired
    BukuRepository bukuRepository;

    @GetMapping(value = "checkingApi")
    public String checkApi(){
        return "Hello World";
    }

    @PostMapping(value = "addNewBuku" )
    public BukuEntity addNewBuku(@RequestBody BukuEntity param){

        bukuRepository.save(param);
        return param;
    }

    @GetMapping(value = "getAllBuku")
    public List<BukuEntity> getAllBuku(){
        return bukuRepository.findAll();
    }

    @GetMapping(value = "getById")
    public BukuEntity getById(@RequestParam int id){
        return bukuRepository.findById(id).get();
    }

    @PostMapping (value = "updateBuku")
    public BukuEntity updateBuku (@RequestBody BukuEntity param){
        return bukuRepository.save(param);
    }

    @GetMapping (value = "deleteBuku")
    public List<BukuEntity> deleteBuku (@RequestParam int id){
        bukuRepository.deleteById(id);
        List<BukuEntity> bukuList = bukuRepository.findAll();
        return bukuList;
    }

//    @GetMapping(value = "getByStatus")
//    public List<BukuEntity> sortstatus(@PathVariable(value="statusBuku") int statusBuku){
//        return bukuRepository.findByStatusBuku(statusBuku);
//    }
}
