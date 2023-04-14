package com.douglas.langaugeappbackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="VocabList")
@Entity
public class VocabList {

    private Long id;

    public void setId(Long id) {this.id = id;}
    @Id
    public Long getId() {return id;}
}
