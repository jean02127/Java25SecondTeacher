package lesson3;

public class SedanV2 extends Car {
    public SedanV2(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    public void light() {
        String getCarName = super.getName();
        System.out.println(getCarName + "新功能: 開燈");
    }
}