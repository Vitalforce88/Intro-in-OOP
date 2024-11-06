package Seminar2.taxi;

public class YandexTaxi extends Taxi {
    @Override
    void sayAddress(String address) {
        System.out.println("Вызвал такси на адрес " + address);
    }

    @Override
    public void drive() {
        System.out.println("Еду на адрес");
    }
}
