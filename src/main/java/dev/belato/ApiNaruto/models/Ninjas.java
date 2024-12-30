package dev.belato.ApiNaruto.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ninjas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ninjas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String name;
    private int age;
    private String village;
    private String element;
    private String imgUrl;
}
