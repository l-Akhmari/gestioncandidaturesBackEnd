package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.Admin;
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
