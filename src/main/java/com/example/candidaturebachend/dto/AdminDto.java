package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.ChefDepartement;
import com.example.candidaturebachend.entities.DirectionPedagogique;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminDto {
    private int idAdmin;
    private List<ChefDepartementDto> chefDepartementsDto;
    private DirectionPedagogiqueDto directionPedagogiqueDto;
}
