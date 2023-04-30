package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.AdminDto;
import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.dto.DirectionPedagogiqueDto;
import com.example.candidaturebachend.dto.FichierDto;
import com.example.candidaturebachend.entities.Admin;
import com.example.candidaturebachend.entities.DirectionPedagogique;
import com.example.candidaturebachend.entities.Fichier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.dozer.DozerBeanMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ToString
@AllArgsConstructor
public class DirectionPedagMapper {
    private DozerBeanMapper mapper;
    private AdminMapper adminMapper;

    //direction to dto
    public DirectionPedagogiqueDto directionPedagogiqueToDto(DirectionPedagogique directionPedagogique){
            if (directionPedagogique == null) {
                return null;
            }
        DirectionPedagogiqueDto directionPedagogiqueDto = mapper.map(directionPedagogique, DirectionPedagogiqueDto.class);

            if(directionPedagogique.getAdmin()!=null){
                AdminDto adminDto = adminMapper.adminToDto(directionPedagogique.getAdmin());
                directionPedagogiqueDto.setAdminDto(adminDto);
            }

        return directionPedagogiqueDto;
    }

    //dto to direction

    public DirectionPedagogique dtoTodirectionPedagogique(DirectionPedagogiqueDto directionPedagogiqueDto){
        if (directionPedagogiqueDto == null) {
            return null;
        }
        DirectionPedagogique directionPedagogique = mapper.map(directionPedagogiqueDto, DirectionPedagogique.class);

            if (directionPedagogiqueDto.getAdminDto()!=null){
                Admin admin = adminMapper.adminDtoToAdmin(directionPedagogiqueDto.getAdminDto());
                directionPedagogique.setAdmin(admin);
            }

        return null;
    }

}
