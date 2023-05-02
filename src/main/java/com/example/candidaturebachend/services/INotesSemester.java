package com.example.candidaturebachend.services;

import com.example.candidaturebachend.entities.NotesSemester;

import java.util.List;

public interface INotesSemester {
    NotesSemester addNotesSemester(NotesSemester notesSemester);
    List<NotesSemester> findAllNotesSemesters();
    NotesSemester findNotesSemesterById(Integer id);
    NotesSemester updateNotesSemester(NotesSemester notesSemester);
    void deleteNotesSemester(Integer id);
}
