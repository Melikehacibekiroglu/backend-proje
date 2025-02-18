package com.example.notalmabackend.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @GetMapping
    public String getNotes() {
        return "Notlar buraya gelecek!";
    }
}