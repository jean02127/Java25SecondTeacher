package lesson1;
// 類別
public class Car {
    // 屬性
    public String color;
    public String number;

    // 建構子(跟類別同名稱的方法)
    // 初始化物件的屬性
    public Car(String inputNumber, String inputColor) {
        this.number = inputNumber;
        this.color = inputColor;
    }
    
    // 方法
    public void showCarInfo() {
        System.out.println("Car number: " + this.number + " & Car color: " + this.color);
    }
}