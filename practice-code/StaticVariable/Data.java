package StaticVariable;

public class Data {

    private String firstName;
    private String secondName;
    private static int membersAmount = 0; // means that every object shares the same variable

    public Data(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.membersAmount++;

        System.out.printf("Constructor for %s %s, members in the: %d\n", firstName, secondName, membersAmount);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public static int getMembersAmount() {
        return membersAmount;
    }
}