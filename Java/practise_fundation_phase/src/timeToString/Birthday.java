package timeToString;

public class Birthday {

    private String name;
    private Time birthday;

    public Birthday(String name, Time birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String toString() {
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }
}