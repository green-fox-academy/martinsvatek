package com.listingtodos.database.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Add a Todo class with the fields:
// id: long, title: String, urgent: boolean(default false), done: boolean(default false))

//

@Entity // create table from this class
public class ToDo {

    @Id // key value
    @GeneratedValue // value will be set automatically
    private long id;
    private String title;
    private boolean urgent;
    private boolean done;

    public ToDo() { // because of spring or inheritance
    }

    public ToDo(String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public ToDo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    public ToDo(String title, boolean urgent) {
        this.title = title;
        this.urgent = urgent;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}