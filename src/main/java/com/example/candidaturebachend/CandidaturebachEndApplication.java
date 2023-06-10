package com.example.candidaturebachend;

import com.example.candidaturebachend.dto.*;
import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.entities.Diplome;
import com.example.candidaturebachend.entities.Fichier;
import com.example.candidaturebachend.entities.NotesSemester;
import com.example.candidaturebachend.enums.TypeDiplome;
import com.example.candidaturebachend.enums.TypeDiplomeAObtenir;
import com.example.candidaturebachend.enums.TypeFormation;
import com.example.candidaturebachend.mappers.DiplomeMapper;
import com.example.candidaturebachend.repositories.CandidatRepository;
import com.example.candidaturebachend.repositories.DiplomeRepository;
import com.example.candidaturebachend.repositories.FichierRepository;
import com.example.candidaturebachend.servicesDto.serviceImpDto.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.*;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
@Slf4j
public class CandidaturebachEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidaturebachEndApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CandidatDtoServiceImp candidatDtoImp,
                                        DiplomeDtoServiceImpl diplomeDtoService,
                                        FichierDtoServiceImpl fichierDtoService,
                                        DepartementDtoServiceImpl departementDtoService,
                                        FiliereDtoServiceImpl filiereDtoService
    ){
        return args -> {
            Stream.of("Math Info","Génie mecanique","Genie electrique").forEach(name->{
                DepartementDto departementDto = new DepartementDto();
                departementDto.setIntitule(name);
                DepartementDto savedepartement = departementDtoService.savedepartement(departementDto);
                log.info(savedepartement+"*************************");
            });
            departementDtoService.listDepartements().forEach(departementDto -> {
                for (int i=0; i<2;i++){
                    FiliereDto filiereDto = new FiliereDto();
                    filiereDto.setIntitule("filiere"+(i+1)+" de "+departementDto.getIntitule());
                    filiereDto.setTypeFormation(Math.random()>0.5 ? TypeFormation.Formation_Initiale : TypeFormation.Formation_Continue);
                    filiereDto.setDepartementDto(departementDto);
                    filiereDto.setTypeDiplomeAObtenir(Math.random()> 0.5 ? TypeDiplomeAObtenir.Cycle_Ingenieur : TypeDiplomeAObtenir.Master);
                    filiereDtoService.savefiliere(filiereDto);
                }
            });
            List<FiliereDto> filiereDtos = filiereDtoService.listFilieres();

            log.info(filiereDtos+"'''''''''''''''''''''''''''''''''''''");
            filiereDtoService.listFilieres().forEach(filiereDto -> {
                log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                log.info(""+filiereDto);
            });

           List<FiliereDto>  filiereDto=filiereDtoService.getFiliereByFormation(TypeFormation.Formation_Continue);
            log.info(filiereDto+"####");


            Stream.of("fatima","nezha","tawahd", "nana").forEach(name->{
                CandidatDto candidatDto=new CandidatDto();
                candidatDto.setId(UUID.randomUUID().toString());
                candidatDto.setAddresse("addresse de "+name);
                candidatDto.setNom(name);
                candidatDto.setEmail(name+"@gmail.com");
                candidatDto.setDateNaissance(new Date());
                candidatDto.setCin("cin de "+name);
                candidatDto.setPrenom(name);
                candidatDto.setBac("science math A");
                candidatDto.setBacAnneObtention(new Date());
                candidatDto.setDateNaissance(new Date());
                candidatDto.setPays("Maroc");
                candidatDto.setVille("Guelmim");
                CandidatDto candidatDto1 = candidatDtoImp.saveCandidat(candidatDto);
                FichierDto fichierDto=new FichierDto();
                fichierDto.setChemin("nom de fichier de "+name);
                fichierDto.setId(UUID.randomUUID().toString());
                log.info(fichierDto+"======fichierdto====");
                FichierDto fichierDto1 = fichierDtoService.saveFichier(fichierDto);
                log.info("---------------------------------------------------------------");
                log.info("---------------------------------------------------------------");

                   DiplomeDto diplomeDto=new DiplomeDto();
                    diplomeDto.setCandidatDto(candidatDto1);
                    diplomeDto.setTypeDiplome(TypeDiplome.DUT);
                    diplomeDto.setEtablissement("ESTG");
                    diplomeDto.setAnneeObtention(new Date());
                    log.info("==+++===@@@@@===="+fichierDto1);
                    diplomeDto.setFichierDto(fichierDto1);

                        Random rn = new Random();
                        int answer = rn.nextInt(5) + 1;
                    log.info("########"+filiereDtos.get(answer)+"###########");
                    diplomeDto.setFiliereDto(filiereDtos.get(answer));
                    log.info("==+++===@@@@@===="+diplomeDto);
                    DiplomeDto diplomeDto1 = diplomeDtoService.saveDiplome(diplomeDto);
                    log.info("@@@@"+diplomeDto1);
                    NotesSemesterDto notesSemesterDto=new NotesSemesterDto();
                    notesSemesterDto.setNote(17.5);
                    notesSemesterDto.setDiplomeDto(diplomeDto1);

                  NotesSemesterDto notesSemesterDtoSaved = diplomeDtoService.saveNoteSemester(notesSemesterDto,diplomeDto1.getId());
                System.out.println(notesSemesterDtoSaved);

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


    @Bean
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
    //@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:4200") // Add your Angular application's origin here
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("*");
            }
        };
    }


}
