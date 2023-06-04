package com.example.candidaturebachend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("Admin")

public class Admin extends Utilisateur implements Serializable {
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdmin;*/
    @OneToMany(mappedBy = "admin", fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<ChefDepartement> chefDepartements;

    @OneToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private DirectionPedagogique directionPedagogique;
}