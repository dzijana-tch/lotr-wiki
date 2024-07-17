package by.charniuk.lotr_wiki.model;

import lombok.Data;

@Data
public class Character {

    private Long id;
    private String name;
    private String title;
    private String race;
}
