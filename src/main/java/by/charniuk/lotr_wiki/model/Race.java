package by.charniuk.lotr_wiki.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "race")
public class Race {

    @Id
    private String name;
    private String appearance;
    private String height;
    private String lifespan;
}
