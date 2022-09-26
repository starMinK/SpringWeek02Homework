package com.week02homework.week02homework.controller;

import com.week02homework.week02homework.domain.Person;
import com.week02homework.week02homework.domain.PersonRepository;
import com.week02homework.week02homework.domain.PersonRequestDto;
import com.week02homework.week02homework.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public  class PersonController {

    private final PersonRepository personRepository;
    private final PersonService personService;


    @PostMapping("/api/people") //Create
    public Person createPerson(@RequestBody PersonRequestDto requestDto){
        Person person = new Person(requestDto);
        return personRepository.save(person);
    }

    @GetMapping("/api/people") //Read
    public List<Person> getPerson() {
        return personRepository.findAll();
    }

    @PutMapping("/api/people/{id}") //Update
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto) {
        return personService.update(id, requestDto);
    }

    @DeleteMapping("/api/people/{id}")
    public Long deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
        return id;
    }

}
