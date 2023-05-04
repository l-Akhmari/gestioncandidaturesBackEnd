package com.example.candidaturebachend.services;

import com.example.candidaturebachend.dto.CandidatDto;
import com.example.candidaturebachend.entities.Candidat;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ICandidat {

    Candidat addCandidat2(String username , String prenom , String cin, String cne, String email, String telephone, String ville, String adresse, boolean admis , Date dateNaissance, String mdp);

    Candidat addCandidat(Candidat candidat);
    List<Candidat> findAllCandidats();
    Candidat findCandidatById(String id);
    Candidat updateCandidat(Candidat candidat);
    void deleteCandidat(String id);
}
