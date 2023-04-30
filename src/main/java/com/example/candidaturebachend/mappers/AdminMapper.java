package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.AdminDto;
import com.example.candidaturebachend.entities.Admin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dozer.DozerBeanMapper;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminMapper {
    private DozerBeanMapper mapper;

    //admin to dto

    public AdminDto adminToDto(Admin admin){
        //TODO:todo
        return null;
    }


    //dto to admin
    public Admin adminDtoToadmin(AdminDto adminDto){
        //TODO:todo

        return null;
    }

}
