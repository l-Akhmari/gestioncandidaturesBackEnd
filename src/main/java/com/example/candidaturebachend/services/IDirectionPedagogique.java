package com.example.candidaturebachend.services;

import com.example.candidaturebachend.entities.DirectionPedagogique;

import java.util.List;

public interface IDirectionPedagogique {
    DirectionPedagogique addDirectionPedagogique(DirectionPedagogique directionPedagogique);
    List<DirectionPedagogique> findAllDirectionPedagogiques();
    DirectionPedagogique findDirectionPedagogiqueById(String id);
    DirectionPedagogique updateDirectionPedagogique(DirectionPedagogique directionPedagogique);
    void deleteDirectionPedagogique(String id);
}
