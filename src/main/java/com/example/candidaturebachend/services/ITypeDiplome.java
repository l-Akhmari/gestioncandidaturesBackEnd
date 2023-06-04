package com.example.candidaturebachend.services;

import java.util.List;

public interface ITypeDiplome {
    TypeDiplome addTypeDiplome(TypeDiplome typeDiplome);
    List<TypeDiplome> findAllTypeDiplomes();
    TypeDiplome findTypeDiplomeById(Integer id);
    TypeDiplome updateTypeDiplome(TypeDiplome typeDiplome);
    void deleteTypeDiplome(Integer id);
}
