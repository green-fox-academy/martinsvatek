package TimeClock;

public class Main {
    public static void main(String[] args) {

        TimeSetting timeSettingObject = new TimeSetting();

        System.out.println(timeSettingObject.setToMilitaryTimeFormat());
        System.out.println(timeSettingObject.setAmericanTimeFormat());
        System.out.println("----------");

        timeSettingObject.setTime(14, 30, 6);
        System.out.println(timeSettingObject.setToMilitaryTimeFormat());
        System.out.println(timeSettingObject.setAmericanTimeFormat());
    }
}