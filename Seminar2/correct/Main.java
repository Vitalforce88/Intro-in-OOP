package Seminar2.correct;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Speakable> speakableList = new ArrayList<>();

        speakableList.add(new Cat());
        speakableList.add(new Dog());
        speakableList.add(new Bird());
        speakableList.add(new Radio());


        ZooSound zoosound = new ZooSound(speakableList);
        zoosound.speakAll();

    }
}