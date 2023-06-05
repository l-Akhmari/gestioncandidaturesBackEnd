package com.example.candidaturebachend.servicesDto.serviceImpDto;

import com.example.candidaturebachend.Exceptions.fileNotFoundException;
import com.example.candidaturebachend.dto.FichierDto;
import com.example.candidaturebachend.entities.Fichier;
import com.example.candidaturebachend.mappers.FichierMapper;
import com.example.candidaturebachend.repositories.FichierRepository;
import com.example.candidaturebachend.servicesDto.serviceInterfaceDto.IFichier;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class FichierDtoServiceImpl implements IFichier {
    private FichierMapper fichierMapper;
    private FichierRepository fichierRepository;
    @Override
    public FichierDto saveFichier(FichierDto fichierDto) {
        log.info("Saving new File");
        Fichier fichier = fichierMapper.fichierDtoTofichier(fichierDto);
        fichier.setId(UUID.randomUUID().toString());
        Fichier savedFichier = fichierRepository.save(fichier);
        log.info("------------------------------------------------------------------------------------------------");
        log.info("id fichier = "+savedFichier.getId());
        return fichierMapper.fichierToFichierDto(savedFichier);
    }

    @Override
    public List<FichierDto> listFichier() {
        List<Fichier> fichiers = fichierRepository.findAll();
        List<FichierDto> fichierDTOS = fichiers.stream()
                .map(fichier -> fichierMapper.fichierToFichierDto(fichier))
                .collect(Collectors.toList());
        return fichierDTOS;
    }

    @Override
    public FichierDto getFichier(String id) throws fileNotFoundException {
        Fichier fichier = fichierRepository.findById(id)
                .orElseThrow(() -> new fileNotFoundException("File Not Found"));
        return fichierMapper.fichierToFichierDto(fichier);
    }

    @Override
    public FichierDto updateFichier(FichierDto fichierDto) {
        log.info("Saving new file");
        Fichier fichier=fichierMapper.fichierDtoTofichier(fichierDto);
        Fichier savedFichier = fichierRepository.save(fichier);
        return fichierMapper.fichierToFichierDto(savedFichier);
    }

    @Override
    public void deleteFichier(String id) {
        fichierRepository.deleteById(id);
    }
}
