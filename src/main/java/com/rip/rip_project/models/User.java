package com.rip.rip_project.models;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "userIdSeq", sequenceName = "user_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userIdSeq")
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "totalGames", nullable = false)
    private Integer totalGames;
    @Column(name = "highestScore")
    private Integer highestScore;
    @Column(name = "lastScore")
    private Integer lastScore;
    @Column(name = "averageScore")
    private Integer averageScore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    public Integer getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(Integer totalGames) {
        this.totalGames = totalGames;
    }

    public Integer getHighestScore() {
        return highestScore;
    }

    public void setHighestScore(Integer highestScore) {
        this.highestScore = highestScore;
    }

    public Integer getLastScore() {
        return lastScore;
    }

    public void setLastScore(Integer lastScore) {
        this.lastScore = lastScore;
    }

    public Integer getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Integer averageScore) {
        this.averageScore = averageScore;
    }
}