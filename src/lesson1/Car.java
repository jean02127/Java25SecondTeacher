package lesson1;
// 類別
public class Car {
    /* 
     * 類別的屬性為全域變數(global)，可以讓這個類別下的所有方法做使用
     */
    // 屬性
    public String color;
    public String number;

    /* 建構子(跟類別同名稱的方法)
     * 初始化物件的屬性 
     */
    // 1
    public Car(String number, String color) {
        // 在此method宣告的變數為區域變數(local)
        // 沒寫this的變數為區域變數，只能在這個method內使用
        // 區域變數與變數名稱相同時，this.代表這個類別的屬性(=全域變數)
        this.number = number;
        this.color = color;
    }
    // 2
    // public Car(String inputNumber, String inputColor) {
    //     this.number = inputNumber;
    //     this.color = inputColor;
    // }
    
    // 方法
    public void showCarInfo() {
        System.out.println("Car number: " + this.number + " & Car color: " + this.color);
    }
}