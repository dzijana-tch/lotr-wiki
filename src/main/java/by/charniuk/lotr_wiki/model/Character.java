package by.charniuk.lotr_wiki.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "character")
public class Character {

    @Id
    private String name;
    private String title;
    @ManyToOne
    @JoinColumn(name = "race", referencedColumnName = "name")
    private Race race;
}
