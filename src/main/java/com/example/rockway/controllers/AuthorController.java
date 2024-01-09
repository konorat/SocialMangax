package com.example.rockway.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.rockway.Dto.AuthorDto;
import com.example.rockway.models.Author;
import com.example.rockway.repositories.AuthorRepository;

@Controller
@RequestMapping
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    
    @PostMapping(path="/addAuthor")
    public @ResponseBody String addNewAuthor (@RequestBody AuthorDto authorDto){

        Author author = new Author();
        author.setFirstName(authorDto.getFirstName());
        author.setLastName(authorDto.getLastName());

        authorRepository.save(author);
        return "Adicionado com Sucesso!";
    }

    @GetMapping(path="/allAuthor")
    public @ResponseBody Iterable<Author> getAllUsers(){
        return authorRepository.findAll();
    }
}
