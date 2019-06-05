package com.orientationexamtrial.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class Website {

    @Id // key value
    @GeneratedValue(strategy = GenerationType.AUTO) // autoincrement
    private long id;

    private String url;
    private String alias;
    private int hitCount;

    @JsonIgnore // invisible for json
    private int secretCode;

    Random random;

    public Website() { // empty constructor
    }

    public Website(String url, String alias) {
        this.url = url;
        this.alias = alias;
        this.random = new Random();
        this.secretCode = generateSecretCode();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public void increaseHitCount() { // increase hit count
        this.hitCount += 1;
    }

    public int getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(int secretCode) {
        this.secretCode = secretCode;
    }

    public int generateSecretCode() {
        return 1000 + random.nextInt(9000);
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}