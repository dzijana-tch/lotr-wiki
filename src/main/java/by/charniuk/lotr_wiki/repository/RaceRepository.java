package by.charniuk.lotr_wiki.repository;

import by.charniuk.lotr_wiki.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RaceRepository extends JpaRepository<Race, Long> {

    Race findByName(String name);
    List<Race> findByNameContainingIgnoreCase(String name);
    void deleteByName(String name);
}
