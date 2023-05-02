package com.example.candidaturebachend.web;

import com.example.candidaturebachend.entities.Diplome;
import com.example.candidaturebachend.repositories.DiplomeRepository;
import com.example.candidaturebachend.services.servicesImpl.DiplomeServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/diplome")
//@CrossOrigin
public class DiplomeController {
    @Autowired
    private DiplomeServiceImpl diplomeService;
    @Autowired
    DiplomeRepository diplomeRepo;


    @GetMapping("/all")
    public ResponseEntity<List<Diplome>> getAllDiplomes() {
        List<Diplome> diplomes = diplomeService.findAllDiplomes();
        return new ResponseEntity<>(diplomes, HttpStatus.OK);

    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Diplome> getDiplomeById(@PathVariable("id") Integer id) {
        Diplome diplome = diplomeService.findDiplomeById(id);
        return new ResponseEntity<>(diplome, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Diplome> addDiplome(@RequestBody Diplome diplome) {
        Diplome newDiplome = diplomeService.addDiplome(diplome);
        return new ResponseEntity<>(newDiplome, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Diplome> updateDiplome(@RequestBody Diplome diplome) {
        Diplome updateDiplome = diplomeService.updateDiplome(diplome);
        return new ResponseEntity<>(updateDiplome, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDiplome(@PathVariable("id") Integer id) {
        diplomeService.deleteDiplome(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
