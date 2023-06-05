package com.example.candidaturebachend.web;

import com.example.candidaturebachend.entities.NotesSemester;
import com.example.candidaturebachend.repositories.NotesSemesterRepository;
import com.example.candidaturebachend.services.servicesImpl.NotesSemesterServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/notesSemester")
public class NotesSemesterController {
    @Autowired
    private NotesSemesterServiceImpl notesSemesterService;
    @Autowired
    NotesSemesterRepository notesSemesterRepo;


    @GetMapping("/all")
    public ResponseEntity<List<NotesSemester>> getAllNotesSemesters() {
        List<NotesSemester> notesSemesters = notesSemesterService.findAllNotesSemesters();
        return new ResponseEntity<>(notesSemesters, HttpStatus.OK);

    }

    @GetMapping("/find/{id}")
    public ResponseEntity<NotesSemester> getNotesSemesterById(@PathVariable("id") Integer id) {
        NotesSemester notesSemester = notesSemesterService.findNotesSemesterById(id);
        return new ResponseEntity<>(notesSemester, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<NotesSemester> addNotesSemester(@RequestBody NotesSemester notesSemester) {
        NotesSemester newNotesSemester = notesSemesterService.addNotesSemester(notesSemester);
        return new ResponseEntity<>(newNotesSemester, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<NotesSemester> updateNotesSemester(@RequestBody NotesSemester notesSemester) {
        NotesSemester updateNotesSemester = notesSemesterService.updateNotesSemester(notesSemester);
        return new ResponseEntity<>(updateNotesSemester, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteNotesSemester(@PathVariable("id") Integer id) {
        notesSemesterService.deleteNotesSemester(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
