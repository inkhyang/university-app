package com.inkhyang.pet.infrastructure.web.student;

import com.inkhyang.pet.infrastructure.web.mapper.StudentDtoMapper;
import com.inkhyang.pet.domain.student.Student;
import com.inkhyang.pet.application.exception.StudentNotFoundException;
import com.inkhyang.pet.application.impl.StudentServiceImpl;
import com.inkhyang.pet.infrastructure.web.student.dto.MarkDto;
import com.inkhyang.pet.infrastructure.web.student.dto.StudentDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentServiceImpl service;
    private final StudentDtoMapper studentMapper;

    public StudentController(StudentServiceImpl service, StudentDtoMapper studentMapper) {
        this.service = service;
        this.studentMapper = studentMapper;
    }


    @GetMapping
    public List<StudentDto> all() {
        return service.getAll().stream()
                .map(studentMapper::toDto)
                .toList();
    }

    @PostMapping
    public StudentDto create(@RequestBody StudentDto newStudent) {
        Student student = service.create(studentMapper.toDomain(newStudent));
        return studentMapper.toDto(student);
    }

    @GetMapping("/{id}")
    public StudentDto one(@PathVariable String email) {
        return service.getById(new Student.StudentId(email))
                .map(studentMapper::toDto)
                .orElseThrow(() -> new StudentNotFoundException(email));
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String email) {
        service.remove(new Student.StudentId(email));
    }
    @PatchMapping
    public void update(@PathVariable String email, @RequestBody MarkDto markDto) {
        service.update(new Student.StudentId(email), markDto.discipline(), markDto.score());
    }
}
