package com.chekan.leverX.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false, unique = true)
    @Size(min = 2, max = 50, message = "Name length must be between 2 and 50 characters")
    private String name;

    public Game(){}

    public Game(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                //", gameObjects=" + gameObjects +
                '}';
    }
}