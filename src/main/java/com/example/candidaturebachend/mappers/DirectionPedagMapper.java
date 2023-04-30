package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.DirectionPedagogiqueDto;
import com.example.candidaturebachend.entities.DirectionPedagogique;
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

    //direction to dto
    public DirectionPedagogiqueDto directionPedagogiqueToDto(DirectionPedagogique directionPedagogique){
        return null;
    }
    public List<DirectionPedagogiqueDto> directionPedagogiqueToDtos(List<DirectionPedagogique> directionPedagogiques){
        return null;
    }

    //dto to direction

    public DirectionPedagogique dtoTodirectionPedagogique(DirectionPedagogiqueDto directionPedagogiqueDto){
        //TODO:todo

        return null;
    }
    public List<DirectionPedagogique> dtosTodirectionPedagogiques(List<DirectionPedagogiqueDto> directionPedagogiquesDtos){
        //TODO:todo

        return null;
    }

}
