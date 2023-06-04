package com.example.candidaturebachend.services.servicesImpl;

//import com.example.candidaturebachend.mappers.DiplomeMapper;
import com.example.candidaturebachend.Exceptions.UserNotFoundException;
import com.example.candidaturebachend.entities.Diplome;
        import com.example.candidaturebachend.repositories.DiplomeRepository;
import com.example.candidaturebachend.services.IDiplome;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class DiplomeServiceImpl implements IDiplome {
    DiplomeRepository diplomeRepository;

    @Override
    public Diplome addDiplome(Diplome diplome) {
        return diplomeRepository.save(diplome);
    }

    @Override
    public List<Diplome> findAllDiplomes() {
        return diplomeRepository.findAll();
    }

    @Override
    public Diplome findDiplomeById(Integer id) {
        return diplomeRepository.findDiplomeByIdDiplome(id).orElseThrow(() -> new UserNotFoundException("Diplome by id " + id + " was not found"));
    }

    @Override
    public Diplome updateDiplome(Diplome diplome) {
        return diplomeRepository.save(diplome);
    }

    @Override
    public void deleteDiplome(Integer id) {
        diplomeRepository.deleteById(id);
    }
}
