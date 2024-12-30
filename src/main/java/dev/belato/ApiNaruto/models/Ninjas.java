package dev.belato.ApiNaruto.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ninjas")
public class Ninjas {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private int age;
    private String village;
    private String element;
    private String imgUrl;

    public Ninjas() {
    };

    public Ninjas(String id, String name, int age, String village, String element, String imgUrl) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.village = village;
        this.element = element;
        this.imgUrl = imgUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
