package com.example.candidaturebachend.web;

import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.entities.Diplome;
//import com.example.candidaturebachend.mappers.DiplomeMapper;
import com.example.candidaturebachend.services.servicesImpl.DiplomeServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@Builder
//@NoArgsConstructor
@AllArgsConstructor
@RestController
//@RequestMapping("/diplome")
public class DiplomeController {

    private DiplomeServiceImpl diplomeService;
    //private DiplomeMapper diplomeMapper;



    @GetMapping("/all")
    public List<Diplome> Diplomes(){
        return diplomeService.findAllDiplomes();

    }    /*public ResponseEntity<List<DiplomeDto>> getAllDiplomes() {
        List<DiplomeDto> diplomes = diplomeService.findAllDiplomes();
        return  new ResponseEntity<>(diplomes , HttpStatus.OK);
    }*/

}
