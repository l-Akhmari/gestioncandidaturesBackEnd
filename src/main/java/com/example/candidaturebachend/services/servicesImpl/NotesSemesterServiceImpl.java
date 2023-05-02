package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.Exceptions.UserNotFoundException;
import com.example.candidaturebachend.entities.NotesSemester;
import com.example.candidaturebachend.repositories.NotesSemesterRepository;
import com.example.candidaturebachend.services.INotesSemester;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class NotesSemesterServiceImpl implements INotesSemester {
    NotesSemesterRepository notesSemesterRepository;

    @Override
    public NotesSemester addNotesSemester(NotesSemester notesSemester) {
        return notesSemesterRepository.save(notesSemester);
    }

    @Override
    public List<NotesSemester> findAllNotesSemesters() {
        return notesSemesterRepository.findAll();
    }

    @Override
    public NotesSemester findNotesSemesterById(Integer id) {
        return notesSemesterRepository.findNotesSemesterByIdNotes(id).orElseThrow(() -> new UserNotFoundException("NotesSemester by id " + id + " was not found"));
    }

    @Override
    public NotesSemester updateNotesSemester(NotesSemester notesSemester) {
        return notesSemesterRepository.save(notesSemester);
    }

    @Override
    public void deleteNotesSemester(Integer id) {
        notesSemesterRepository.deleteById(id);
    }
}
