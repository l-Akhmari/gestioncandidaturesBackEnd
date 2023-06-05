package com.example.candidaturebachend;

import com.example.candidaturebachend.dto.CandidatDto;
import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.dto.FichierDto;
import com.example.candidaturebachend.enums.TypeDiplome;
import com.example.candidaturebachend.servicesDto.serviceImpDto.CandidatDtoServiceImp;
import com.example.candidaturebachend.servicesDto.serviceImpDto.DiplomeDtoServiceImpl;
import com.example.candidaturebachend.servicesDto.serviceImpDto.FichierDtoServiceImpl;
import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
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
                candidatDto.setIdCandidat(UUID.randomUUID().toString());
                candidatDto.setAddresse("addresse de "+name);
                candidatDto.setNom(name);
                candidatDto.setEmail(name+"@gmail.com");
                candidatDto.setDateNaissance(new Date());
                candidatDto.setCin("cin de "+name);
                candidatDto.setPrenom(name);
                candidatDtoImp.saveCandidat(candidatDto);
                FichierDto fichierDto=new FichierDto();
                fichierDto.setChemin("nom de fichier de "+name);
                fichierDto.setIdFichier(UUID.randomUUID().toString());
                fichierDtoService.saveFichier(fichierDto);
               /*DiplomeDto diplomeDto=new DiplomeDto();
                diplomeDto.setCandidatDto(candidatDto1);
                diplomeDto.setTypeDiplome(TypeDiplome.DUT);
                diplomeDto.setEtablissement("ESTG");
                diplomeDto.setAnneeObtention(new Date());
                diplomeDto.setFichierDto(fichierDto1);
                diplomeDtoService.saveDiplome(diplomeDto,candidatDto1,fichierDto1);*/

            });
            candidatDtoImp.listCandidats().forEach(candidatDto -> {

               DiplomeDto diplomeDto=new DiplomeDto();
                diplomeDto.setCandidatDto(candidatDto);
                diplomeDto.setTypeDiplome(TypeDiplome.DUT);
                diplomeDto.setEtablissement("ESTG");
                diplomeDto.setAnneeObtention(new Date());
                diplomeDto.setFichierDto(null);
                diplomeDtoService.saveDiplome(diplomeDto);
            });

        };}
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
