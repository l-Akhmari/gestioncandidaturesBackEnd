package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.Exceptions.UserNotFoundException;
import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.repositories.CandidatRepository;
import com.example.candidaturebachend.services.ICandidat;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Data
@AllArgsConstructor
public class CandidatServiceImpl implements ICandidat {
    CandidatRepository candidatRepository;

    @Override
    public Candidat addCandidat(Candidat candidat) {
        candidat.setId(UUID.randomUUID().toString());
        return candidatRepository.save(candidat);
    }
   public Candidat addCandidat2(String username , String prenom , String cin, String cne, String email, String telephone, String ville, String adresse, boolean admis , Date dateNaissance, String mdp){
        Candidat candidat=new Candidat();
        candidat.setId(UUID.randomUUID().toString());
        candidat.setNom(username);
        candidat.setPrenom(prenom);
        candidat.setCin(cin);
        candidat.setCne(cne);
        candidat.setEmail(email);
        candidat.setTelephone(telephone);
        candidat.setVille(ville);
        candidat.setAddresse(adresse);
       return candidatRepository.save(candidat);
   }


        @Override
    public List<Candidat> findAllCandidats() {
        return candidatRepository.findAll();
    }

    @Override
    public Candidat findCandidatById(String id) {
        return candidatRepository.findCandidatById(id).orElseThrow(() -> new UserNotFoundException("Candidat by id " + id + " was not found"));
    }

    @Override
    public Candidat updateCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    @Override
    public void deleteCandidat(String id) {
        candidatRepository.deleteById(id);
    }
}
