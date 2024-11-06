package Seminar2.correct;

import java.util.List;

public class ZooSound {

    List<Speakable> speakableList;

    public ZooSound(List<Speakable> speakableList) {
        this.speakableList = speakableList;
    }

    public void speakAll(){
        for (Speakable speakable: speakableList){
            speakable.speak();
        }

    }

}
