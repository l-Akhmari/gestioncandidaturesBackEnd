/*package com.example.candidaturebachend.web;

import com.example.candidaturebachend.entities.Filiere;
import com.example.candidaturebachend.repositories.FiliereRepository;
import com.example.candidaturebachend.services.servicesImpl.FiliereServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;*/
/*
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/filiere")
public class FiliereController {
    @Autowired
    private FiliereServiceImpl filiereService;
    @Autowired
    FiliereRepository filiereRepo;


    @GetMapping("/all")
    public ResponseEntity<List<Filiere>> getAllFilieres() {
        List<Filiere> filieres = filiereService.findAllFilieres();
        return new ResponseEntity<>(filieres, HttpStatus.OK);

    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Filiere> getFiliereById(@PathVariable("id") Integer id) {
        Filiere filiere = filiereService.findFiliereById(id);
        return new ResponseEntity<>(filiere, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Filiere> addFiliere(@RequestBody Filiere filiere) {
        Filiere newFiliere = filiereService.addFiliere(filiere);
        return new ResponseEntity<>(newFiliere, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Filiere> updateFiliere(@RequestBody Filiere filiere) {
        Filiere updateFiliere = filiereService.updateFiliere(filiere);
        return new ResponseEntity<>(updateFiliere, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFiliere(@PathVariable("id") Integer id) {
        filiereService.deleteFiliere(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
*/