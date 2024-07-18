package by.charniuk.lotr_wiki.repository;

import by.charniuk.lotr_wiki.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterRepository extends JpaRepository<Character, Long> {

    Character findByName(String name);
    List<Character> findByNameContainingIgnoreCase(String name);
    void deleteByName(String name);
}
