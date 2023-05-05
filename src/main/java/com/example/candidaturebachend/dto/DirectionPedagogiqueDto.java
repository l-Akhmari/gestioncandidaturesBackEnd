package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.Admin;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirectionPedagogiqueDto {
    private int idDirectioPedagogique;
    private AdminDto adminDto;

}
/*@AllArgsConstructor
@NoArgsConstructor
public class DirectionPedagogiqueDto {
    private int idDirectioPedagogique;
    //@JsonIgnoreProperties()
    private AdminDto adminDto;
}*/
