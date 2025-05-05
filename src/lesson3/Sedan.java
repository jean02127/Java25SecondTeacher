package lesson3;

public class Sedan extends Car {
    public Sedan(String name, int maxSpeed) {
        /*
         * 如果父母類別建構子有傳入值進去
         * 子類別繼承需要用super去呼叫並帶入值 //super=上一層
         * 因Car方法裡有參數 ex. public Car(int maxSpeed)
         * 除非框框內沒參數 ex. public Car()
         * 不寫super時機: 多載的建構子 && 建構子沒帶參數
         */
        super(name, maxSpeed);
    }

    public void back() {
        String getCarName = super.getName();
        System.out.println(getCarName + "新功能: 後退");
    }
}