package com.example.rockway.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.rockway.Dto.MangaDto;
import com.example.rockway.models.Manga;
import com.example.rockway.models.User;
import com.example.rockway.repositories.MangaRepository;
import com.example.rockway.repositories.UserRepository;

@Controller
@RequestMapping
public class MangaController {
    
    @Autowired
    private MangaRepository mangaRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/addManga")
    public @ResponseBody String addNewManga (@RequestBody MangaDto mangaDto){

        User user = userRepository.findById(mangaDto.getUserId()).orElse(null);

        Manga manga = new Manga();
        manga.setName(mangaDto.getName());
        manga.setVol(mangaDto.getVol());
        manga.setAuthor(mangaDto.getAuthor());
        manga.setUser(user);

        user.addMangaToList(manga);

        mangaRepository.save(manga);
        return "Adicionado com Sucesso!";
    }

    @GetMapping(path="/allManga")
    public @ResponseBody Iterable<Manga> getAllUsers(){
        return mangaRepository.findAll();
    }
}
