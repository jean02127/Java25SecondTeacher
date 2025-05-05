package lesson3;

public class Car {
    private String name;
    private int maxSpeed;

    public Car(String name, int maxSpeed) {
        this.setName(name);
        this.setMaxSpeed(maxSpeed);
    }

    public void getMaxSpeed() {
        System.out.println(this.name + "最高速度: " + this.maxSpeed);
    }

    /*
     * 一律透過此方法改變 maxSpeed
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /*
     * 一律透過此方法改變 name
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * 一律透過此方法取得 name
     */
    public String getName() {
        return this.name;
    }

    public void wiper(){
        System.out.println(this.name + "統一增加的新功能: 雨刷");  
    }
}