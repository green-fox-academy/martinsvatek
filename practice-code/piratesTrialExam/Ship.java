package piratesTrialExam;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> crewMembers = new ArrayList<>();

    public void recruit(Pirate pirate) {
        if (pirate.captain && checkForCaptain()) { //dont recruit if pirate is captain and you already have captain in the crew
            System.out.println("There is already captain on this ship");
        } else {
            crewMembers.add(pirate);
        }
    }

    public boolean checkForCaptain() {
        boolean isThereCaptain = false;
        for (Pirate pirate : crewMembers) {  //change boolean to true if there is already captain between crewMembers
            if (pirate.captain) {
                isThereCaptain = true;
            }
        }
        return isThereCaptain;
    }

    public List getPoorPirates() {
        List<String> poorPirates = new ArrayList<>();
        for (Pirate crewMember : crewMembers) {
            if (crewMember.amountOfGold < 15 && crewMember.woodenLeg) {
                poorPirates.add(crewMember.name);
            }
        }
        return poorPirates;
    }

    public int getGolds() {
        int sumOfGold = 0;
        for (Pirate crewMember : crewMembers) {
            sumOfGold += crewMember.amountOfGold;
        }
        return sumOfGold;
    }

    public void lastDayOnTheShip() {
        for (Pirate crewMember : crewMembers) {
            crewMember.party();
        }
    }

    public void prepareForBattle() {
        for (Pirate crewMember : crewMembers) {
            int workLoad = 5;
            for (int i = 0; i < workLoad; i++) {
                crewMember.work();
            }
        }
        lastDayOnTheShip();
    }
}