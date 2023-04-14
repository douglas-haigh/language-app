package com.douglas.langaugeappbackend.repositories;

import com.douglas.langaugeappbackend.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    List<AppUser> findById(long Id);
}
