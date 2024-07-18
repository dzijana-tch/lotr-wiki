package by.charniuk.lotr_wiki.controller;

import by.charniuk.lotr_wiki.model.Character;

import java.util.List;

public interface CharacterController {

    String addCharacter(Character character);
    List<Character> getAllCharacters();
    List<Character> searchByName(String name);
    String editCharacter(Character character);
    String removeCharacter(String name);
}
