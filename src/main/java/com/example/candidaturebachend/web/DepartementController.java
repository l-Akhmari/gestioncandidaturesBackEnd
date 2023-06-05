/*package com.example.candidaturebachend.web;

import com.example.candidaturebachend.entities.Departement;
import com.example.candidaturebachend.repositories.DepartementRepository;
import com.example.candidaturebachend.services.servicesImpl.DepartementServiceImpl;
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
@RequestMapping("/departement")
public class DepartementController {
    @Autowired
    private DepartementServiceImpl departementService;
    @Autowired
    DepartementRepository departementRepo;


    @GetMapping("/all")
    public ResponseEntity<List<Departement>> getAllDepartements() {
        List<Departement> departements = departementService.findAllDepartements();
        return new ResponseEntity<>(departements, HttpStatus.OK);

    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Departement> getDepartementById(@PathVariable("id") Integer id) {
        Departement departement = departementService.findDepartementById(id);
        return new ResponseEntity<>(departement, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Departement> addDepartement(@RequestBody Departement departement) {
        Departement newDepartement = departementService.addDepartement(departement);
        return new ResponseEntity<>(newDepartement, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Departement> updateDepartement(@RequestBody Departement departement) {
        Departement updateDepartement = departementService.updateDepartement(departement);
        return new ResponseEntity<>(updateDepartement, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDepartement(@PathVariable("id") Integer id) {
        departementService.deleteDepartement(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
*/