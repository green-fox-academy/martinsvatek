package com.d1.demo.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeter {

    @JsonInclude(JsonInclude.Include.NON_NULL) // not null values
    @JsonProperty("welcome_message") // allows us to use different variable name
    private String welcomeMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL) // not null values
    private String error;

    public Greeter(String name, String title) {

        if (title == null && name == null) {
            this.error = "Please provide a name and a title!";
        } else if (name == null) {
            this.error = "Please provide a name!";
        } else if (title == null) {
            this.error = "Please provide a title!";
        } else {
            this.welcomeMessage = "Oh, hi there " + name + ", my dear " + title + "!";
        }
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}