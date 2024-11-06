package Seminar2.correct;

public abstract class Animal implements Speakable {
    private String name;


    public String getName() {
        return name;
    }

    @Override
    public abstract void speak();
}
