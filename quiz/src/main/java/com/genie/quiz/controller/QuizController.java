package com.genie.quiz.controller;

import com.genie.quiz.entity.QuizQuestion;
import com.genie.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class QuizController {
        @Autowired
        QuestionService questionService;

        @GetMapping("/questions")
        public List<QuizQuestion> getQuestions() {
            return questionService.getAllQuestions();
        }

        @PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
        public QuizQuestion saveQuestion(@RequestBody QuizQuestion question) {
            return questionService.saveQuestion(question);
        }

    }

