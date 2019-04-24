package OverloadedConstructors;

public class Main {
    public static void main(String[] args) {

        TimeSetting timeSettingObject1 = new TimeSetting();
        TimeSetting timeSettingObject2 = new TimeSetting(5);
        TimeSetting timeSettingObject3 = new TimeSetting(5, 13);
        TimeSetting timeSettingObject4 = new TimeSetting(5, 13, 43);

        System.out.println(timeSettingObject1.setToMilitaryTimeFormat());
        System.out.println(timeSettingObject2.setToMilitaryTimeFormat());
        System.out.println(timeSettingObject3.setToMilitaryTimeFormat());
        System.out.println(timeSettingObject4.setToMilitaryTimeFormat());

        System.out.println("----------");

        System.out.println(timeSettingObject1.setAmericanTimeFormat());
        System.out.println(timeSettingObject2.setAmericanTimeFormat());
        System.out.println(timeSettingObject3.setAmericanTimeFormat());
        System.out.println(timeSettingObject4.setAmericanTimeFormat());
    }
}