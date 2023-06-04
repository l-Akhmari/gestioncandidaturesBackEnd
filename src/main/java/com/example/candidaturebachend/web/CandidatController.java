package com.example.candidaturebachend.web;

import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.repositories.CandidatRepository;
import com.example.candidaturebachend.services.servicesImpl.CandidatServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/candidat")
public class CandidatController {
    @Autowired
    private CandidatServiceImpl candidatService;
    @Autowired
    CandidatRepository candidatRepo;


    @GetMapping("/all")
    public ResponseEntity<List<Candidat>> getAllCandidats() {
        List<Candidat> candidats = candidatService.findAllCandidats();
        return new ResponseEntity<>(candidats, HttpStatus.OK);

    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Candidat> getCandidatById(@PathVariable("id") String id) {
        Candidat candidat = candidatService.findCandidatById(id);
        return new ResponseEntity<>(candidat, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Candidat> addCandidat(@RequestBody Candidat candidat) {
        Candidat newCandidat = candidatService.addCandidat(candidat);
        return new ResponseEntity<>(newCandidat, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Candidat> updateCandidat(@RequestBody Candidat candidat) {
        Candidat updateCandidat = candidatService.updateCandidat(candidat);
        return new ResponseEntity<>(updateCandidat, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCandidat(@PathVariable("id") String id) {
        candidatService.deleteCandidat(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
