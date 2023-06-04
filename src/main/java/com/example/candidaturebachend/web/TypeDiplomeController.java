package com.example.candidaturebachend.web;

import com.example.candidaturebachend.repositories.TypeDiplomeRepository;
import com.example.candidaturebachend.services.servicesImpl.TypeDiplomeServiceImpl;
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
@RequestMapping("/typeDiplome")
public class TypeDiplomeController {
    @Autowired
    private TypeDiplomeServiceImpl typeDiplomeService;
    @Autowired
    TypeDiplomeRepository typeDiplomeRepo;


    @GetMapping("/all")
    public ResponseEntity<List<TypeDiplome>> getAllTypeDiplomes() {
        List<TypeDiplome> typeDiplomes = typeDiplomeService.findAllTypeDiplomes();
        return new ResponseEntity<>(typeDiplomes, HttpStatus.OK);

    }

    @GetMapping("/find/{id}")
    public ResponseEntity<TypeDiplome> getTypeDiplomeById(@PathVariable("id") Integer id) {
        TypeDiplome typeDiplome = typeDiplomeService.findTypeDiplomeById(id);
        return new ResponseEntity<>(typeDiplome, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<TypeDiplome> addTypeDiplome(@RequestBody TypeDiplome typeDiplome) {
        TypeDiplome newTypeDiplome = typeDiplomeService.addTypeDiplome(typeDiplome);
        return new ResponseEntity<>(newTypeDiplome, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<TypeDiplome> updateTypeDiplome(@RequestBody TypeDiplome typeDiplome) {
        TypeDiplome updateTypeDiplome = typeDiplomeService.updateTypeDiplome(typeDiplome);
        return new ResponseEntity<>(updateTypeDiplome, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTypeDiplome(@PathVariable("id") Integer id) {
        typeDiplomeService.deleteTypeDiplome(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
