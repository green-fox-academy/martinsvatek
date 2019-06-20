package eNumExercise;

public enum Names { //instead of class use emun

    monika("nice", "22"),
    kelsey("cutie", "10"),
    julia("bigmistake", "12"),
    nicole("italian", "13"),
    candy("different", "14"),
    erin("iwish", "16");

    // two variables to represent two arguments
    private final String description; // final - we dont want to change
    private final String age; // final - we dont want to change

    Names(String description, String age) { // constructor
        this.description = description;
        this.age = age;
    }

    public String getDescription() { // how to get the variable
        return description;
    }

    public String getAge() { // how to get the variable
        return age;
    }
}