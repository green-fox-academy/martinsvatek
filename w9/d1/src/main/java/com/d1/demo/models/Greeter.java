package com.d1.demo.models;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Greeter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String welcome_message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;



    public Greeter(String name, String title) {

        if (title == null && name == null) {
            this.error = "Please provide a name and a title!";
        } else if (name == null) {
            this.error = "Please provide a name!";
        } else if (title == null) {
            this.error = "Please provide a title!";
        } else {
            this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
        }
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}