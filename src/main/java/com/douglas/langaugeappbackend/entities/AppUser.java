package com.douglas.langaugeappbackend.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Table(name= "App User")
@Entity
public class AppUser {
    @Id
    @GeneratedValue(generator="increment")
    private Long id;

    @Column(name="username")
    private String username;

    @Column(name="email")
    private String email;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    List<VocabList> vocabLists;


    public void setId(Long id) {this.id = id;}

    public Long getId() {return id;}
}
