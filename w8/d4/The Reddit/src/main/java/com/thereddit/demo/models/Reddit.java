package com.thereddit.demo.models;

import javax.persistence.*;

@Entity // create table from this class
@Table(name = "reddit") //set name of table
public class Reddit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int votes;
    private String title;
    private String url;
    private String description;

    public Reddit() { // empty constructor
    }

    public Reddit(String title, String url, String description) {
        this.votes = 0;
        this.title = title;
        this.url = url;
        this.description = description;
    }

    public void upVotes() {
        this.votes += 1;
    }

    public void downVotes() {
        this.votes += 1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
