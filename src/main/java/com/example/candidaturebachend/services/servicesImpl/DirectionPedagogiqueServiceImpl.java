package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.Exceptions.UserNotFoundException;
import com.example.candidaturebachend.entities.DirectionPedagogique;
import com.example.candidaturebachend.repositories.DirectionPedagogiqueRepository;
import com.example.candidaturebachend.services.IDirectionPedagogique;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class DirectionPedagogiqueServiceImpl implements IDirectionPedagogique {
    DirectionPedagogiqueRepository directionPedagogiqueRepository;

    @Override
    public DirectionPedagogique addDirectionPedagogique(DirectionPedagogique directionPedagogique) {
        return directionPedagogiqueRepository.save(directionPedagogique);
    }

    @Override
    public List<DirectionPedagogique> findAllDirectionPedagogiques() {
        return directionPedagogiqueRepository.findAll();
    }

    @Override
    public DirectionPedagogique findDirectionPedagogiqueById(Integer id) {
        return directionPedagogiqueRepository.findDirectionPedagogiqueById(id).orElseThrow(() -> new UserNotFoundException("DirectionPedagogique by id " + id + " was not found"));
    }

    @Override
    public DirectionPedagogique updateDirectionPedagogique(DirectionPedagogique directionPedagogique) {
        return directionPedagogiqueRepository.save(directionPedagogique);
    }

    @Override
    public void deleteDirectionPedagogique(Integer id) {
        directionPedagogiqueRepository.deleteById(id);
    }
}
