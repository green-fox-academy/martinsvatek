package staticVariable;

public class Main {

    public static void main(String[] args) {

        Data memberOne = new Data ("Megan", "Fox");
        Data memberTwo = new Data ("Natalie", "Portman");
        Data memberThree = new Data ("Taylor", "Swift");

        System.out.println();
        System.out.println(memberOne.getFirstName());
        System.out.println(memberOne.getSecondName());
        System.out.println(memberOne.getMembersAmount());

        System.out.println();
        System.out.println(memberTwo.getFirstName());
        System.out.println(memberTwo.getSecondName());
        System.out.println(memberTwo.getMembersAmount());

        System.out.println();
        System.out.println(memberThree.getFirstName());
        System.out.println(memberThree.getSecondName());
        System.out.println(memberThree.getMembersAmount());

        System.out.println();
        System.out.println(Data.getMembersAmount()); // with static variable we can use "Data" instead of specific object
    }
}