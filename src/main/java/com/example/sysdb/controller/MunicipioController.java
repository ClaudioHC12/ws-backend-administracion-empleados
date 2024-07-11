package com.example.sysdb.controller;

import com.example.sysdb.dto.MunicipioDTO;
import com.example.sysdb.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/municipios")
public class MunicipioController {
    @Autowired
    private MunicipioService municipioService;

    @GetMapping("")
    public ResponseEntity<List<MunicipioDTO>> obtenerMunicipios(){
        return new ResponseEntity<>(municipioService.findAll(), HttpStatus.OK);
    }

}
