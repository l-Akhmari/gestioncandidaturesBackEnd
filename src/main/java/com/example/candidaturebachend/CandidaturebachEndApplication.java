package com.example.candidaturebachend;

import com.example.candidaturebachend.dto.CandidatDto;
import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.dto.FichierDto;
import com.example.candidaturebachend.dto.NotesSemesterDto;
import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.entities.Diplome;
import com.example.candidaturebachend.entities.Fichier;
import com.example.candidaturebachend.entities.NotesSemester;
import com.example.candidaturebachend.enums.TypeDiplome;
import com.example.candidaturebachend.repositories.CandidatRepository;
import com.example.candidaturebachend.repositories.DiplomeRepository;
import com.example.candidaturebachend.repositories.FichierRepository;
import com.example.candidaturebachend.servicesDto.serviceImpDto.CandidatDtoServiceImp;
import com.example.candidaturebachend.servicesDto.serviceImpDto.DiplomeDtoServiceImpl;
import com.example.candidaturebachend.servicesDto.serviceImpDto.FichierDtoServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
@Slf4j
public class CandidaturebachEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidaturebachEndApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CandidatDtoServiceImp candidatDtoImp,
                                        DiplomeDtoServiceImpl diplomeDtoService,
                                        FichierDtoServiceImpl fichierDtoService
    ){
        return args -> {
            Stream.of("fatima","nezha","tawahd").forEach(name->{
                CandidatDto candidatDto=new CandidatDto();
                candidatDto.setId(UUID.randomUUID().toString());
                candidatDto.setAddresse("addresse de "+name);
                candidatDto.setNom(name);
                candidatDto.setEmail(name+"@gmail.com");
                candidatDto.setDateNaissance(new Date());
                candidatDto.setCin("cin de "+name);
                candidatDto.setPrenom(name);
                CandidatDto candidatDto1 = candidatDtoImp.saveCandidat(candidatDto);
                FichierDto fichierDto=new FichierDto();
                fichierDto.setChemin("nom de fichier de "+name);
                fichierDto.setId(UUID.randomUUID().toString());
                FichierDto fichierDto1 = fichierDtoService.saveFichier(fichierDto);
                log.info("---------------------------------------------------------------");
                log.info("---------------------------------------------------------------");
                DiplomeDto diplomeDto=new DiplomeDto();
                diplomeDto.setCandidatDto(candidatDto1);
                diplomeDto.setTypeDiplome(TypeDiplome.DUT);
                diplomeDto.setEtablissement("ESTG");
                diplomeDto.setAnneeObtention(new Date());
                diplomeDto.setFichierDto(fichierDto1);
                DiplomeDto diplomeDto1 = diplomeDtoService.saveDiplome(diplomeDto, candidatDto1, fichierDto1);
               NotesSemesterDto notesSemesterDto=new NotesSemesterDto();
               notesSemesterDto.setNote(17.5);
               notesSemesterDto.setDiplomeDto(diplomeDto1);
               diplomeDtoService.saveNoteSemester(notesSemesterDto,diplomeDto1);

            });



        };}

    //@Bean
    CommandLineRunner commandLineRunner(CandidatRepository candidatRepository,
                                        FichierRepository fichierRepository,
                                        DiplomeRepository diplomeRepository){
        return args -> {
            Stream.of("fatima","nezha","tawahd").forEach(name->{
                Candidat candidat=new Candidat();
                candidat.setId(UUID.randomUUID().toString());
                candidat.setAddresse("addresse de "+name);
                candidat.setNom(name);
                candidat.setEmail(name+"@gmail.com");
                candidat.setDateNaissance(new Date());
                candidat.setCin("cin de "+name);
                candidat.setPrenom(name);
                candidatRepository.save(candidat);
                Fichier fichier=new Fichier();
                fichier.setChemin("nom de fichier de "+name);
                fichier.setId(UUID.randomUUID().toString());
                fichierRepository.save(fichier);

            });

            candidatRepository.findAll().forEach(candidat -> {
                List<Fichier> fichiers = fichierRepository.findAll();
                for (Fichier f: fichiers) {
                    Diplome diplome=new Diplome();
                    diplome.setCandidat(candidat);
                    diplome.setTypeDiplome(TypeDiplome.DUT);
                    diplome.setEtablissement("ESTG");
                    diplome.setAnneeObtention(new Date());
                    diplome.setFichier(f);
                    diplomeRepository.save(diplome);
                }
            });
        };
    }


    //@Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
                "Accept", "Authorization", "Origin, Accept", "X-Requested-With","Access-Control-Allow-Origin",
                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
                "Access-Control-Allow-Origin","Access-Control-Allow-Headers", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }


}