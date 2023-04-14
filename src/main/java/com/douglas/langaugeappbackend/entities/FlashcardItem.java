package com.douglas.langaugeappbackend.entities;

import com.douglas.langaugeappbackend.types.ProgressValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Flashcard")
@Entity
public class FlashcardItem {
    private Long id;

    private String valueOne;
    private String valueTwo;
    private String additionalInfo;
    private String imageURL;
    private String audioURL;
    private boolean isDifficult;
    private ProgressValue progressValue;

    public void setId(Long id) {this.id = id;}
    @Id
    public Long getId() {return id;}
}
