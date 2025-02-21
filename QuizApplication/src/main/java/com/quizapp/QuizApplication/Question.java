package com.quizapp.QuizApplication;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "quiz_questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String correctAnswer;
    private String category;
    private String difficulty;
}
