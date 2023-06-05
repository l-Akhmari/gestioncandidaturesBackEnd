/*package com.example.candidaturebachend.web;

import com.example.candidaturebachend.entities.Fichier;
import com.example.candidaturebachend.repositories.FichierRepository;
import com.example.candidaturebachend.services.servicesImpl.FichierServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;*//*

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/fichier")
public class FichierController {
    @Autowired
    private FichierServiceImpl fichierService;
    @Autowired
    FichierRepository fichierRepo;


    @GetMapping("/all")
    public ResponseEntity<List<Fichier>> getAllFichiers() {
        List<Fichier> fichiers = fichierService.findAllFichiers();
        return new ResponseEntity<>(fichiers, HttpStatus.OK);

    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Fichier> getFichierById(@PathVariable("id") String id) {
        Fichier fichier = fichierService.findFichierById(id);
        return new ResponseEntity<>(fichier, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Fichier> addFichier(@RequestBody Fichier fichier) {
        Fichier newFichier = fichierService.addFichier(fichier);
        return new ResponseEntity<>(newFichier, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Fichier> updateFichier(@RequestBody Fichier fichier) {
        Fichier updateFichier = fichierService.updateFichier(fichier);
        return new ResponseEntity<>(updateFichier, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFichier(@PathVariable("id") String id) {
        fichierService.deleteFichier(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
*/