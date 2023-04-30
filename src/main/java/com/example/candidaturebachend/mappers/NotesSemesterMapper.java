package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.NotesSemesterDto;
import com.example.candidaturebachend.dto.RoleDto;
import com.example.candidaturebachend.entities.NotesSemester;
import com.example.candidaturebachend.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.apache.commons.collections.CollectionUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Data
@ToString
@AllArgsConstructor
public class NotesSemesterMapper {
    private DozerBeanMapper mapper;

    //NotesSemester to Dto
    public NotesSemesterDto NotesSemesterToNotesSemesterDto(NotesSemester notesSemester) {
        if (notesSemester == null) {
            return null;
        }

        NotesSemesterDto notesSemesterDto = mapper.map(notesSemester, NotesSemesterDto.class);
        return notesSemesterDto;
    }

    //Lists
    public List<NotesSemesterDto> AllNoteSemestersToDto(List<NotesSemester> notesSemesters) {

        if (CollectionUtils.isEmpty(notesSemesters)) {
            return Collections.emptyList();
        }

        List<NotesSemesterDto> notesSemesterDtos = new ArrayList<NotesSemesterDto>();

        for(NotesSemester notesSemester : notesSemesters) {
            notesSemesterDtos.add(NotesSemesterToNotesSemesterDto(notesSemester));
        }
        return notesSemesterDtos;
    }

    //Dto to NotesSemester
    public NotesSemester NotesSemesterDtoToNotesSemester(NotesSemesterDto notesSemesterDto){
        if (notesSemesterDto == null) {
            return null;
        }

        NotesSemester notesSemester = mapper.map(notesSemesterDto, NotesSemester.class);
        return notesSemester;
    }

    //Lists
    public List<NotesSemester> AllNoteSemestersDtoToAllNoteSemesters(List<NotesSemesterDto> notesSemesterDtos) {

        if (CollectionUtils.isEmpty(notesSemesterDtos)) {
            return Collections.emptyList();
        }

        List<NotesSemester> notesSemesters = new ArrayList<NotesSemester>();

        for(NotesSemesterDto notesSemesterDto : notesSemesterDtos) {
            notesSemesters.add(NotesSemesterDtoToNotesSemester(notesSemesterDto));
        }
        return notesSemesters;
    }
}
