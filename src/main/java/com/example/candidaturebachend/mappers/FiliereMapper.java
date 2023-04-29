package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.FiliereDto;
import com.example.candidaturebachend.entities.Filiere;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Filer;

@Component
@Data
@ToString
@AllArgsConstructor
public class FiliereMapper {
    private DozerBeanMapper mapper;

    //Contact to Dto
    public FiliereDto FiliereToFiliereDto(Filiere filiere) {
        if (filiere == null) {
            return null;
        }

        FiliereDto filiereDto = mapper.map(filiere, FiliereDto.class);

        if (filiere.getDiplome() != null) {
            filiereDto.setDiplomeDto(mapper.map(filiere.getClient(), ClientDto.class));
        }


        return  contactDto;
    }
    //Lists
    public List<ContactDto> AllContactsToDto(List<Contact> contacts) {

        if (CollectionUtils.isEmpty(contacts)) {
            return Collections.emptyList();
        }

        List<ContactDto> contactDtos = new ArrayList<ContactDto>();

        for (Contact contact : contacts) {
            contactDtos.add(ContactToContactDto(contact));
        }
        return contactDtos;


        /*  return contacts.stream().map(x ->ContactToContactDto(x)).collect(Collectors.toList());
         */
    }

}
