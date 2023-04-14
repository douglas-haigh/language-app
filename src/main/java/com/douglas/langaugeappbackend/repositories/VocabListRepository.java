package com.douglas.langaugeappbackend.repositories;

import com.douglas.langaugeappbackend.entities.VocabList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VocabListRepository extends JpaRepository<VocabList, Long> {
    List<VocabList> findById(long id);
}
