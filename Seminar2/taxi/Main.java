package Seminar2.taxi;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Friend friend = new Friend();
        YandexTaxi taxi = new YandexTaxi();

        friend.setAuto();
        taxi.sayAddress("Ул Выхина");

        List<Driveable> driveables = new ArrayList<>();
        driveables.add(friend);
        driveables.add(taxi);

        for (Driveable driveable: driveables){
            driveable.drive();
        }

    }
}