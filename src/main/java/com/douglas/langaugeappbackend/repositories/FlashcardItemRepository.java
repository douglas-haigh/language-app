package com.douglas.langaugeappbackend.repositories;

import com.douglas.langaugeappbackend.entities.FlashcardItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlashcardItemRepository extends JpaRepository<FlashcardItem, Long> {
    List<FlashcardItem> findById(long id);
}
