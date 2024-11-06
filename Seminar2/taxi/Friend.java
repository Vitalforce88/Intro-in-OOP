package Seminar2.taxi;

public class Friend extends People {
    @Override
    String setAuto() {
        return "Я взял авто!";
    }

    @Override
    public void drive() {
        System.out.println("Я еду на машине." + setAuto());
    }
}
