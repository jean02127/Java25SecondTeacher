package lesson4;

public class Bird implements Flyable, Eatable {
    //引入了一定要實作，不然會出錯
    //fly eat 裡的方法都要被寫出來

    @Override
    public void fly() {
        System.out.println("飛起來");
    }

    @Override
    public void circle() {
        System.out.println("盤旋");
    }

    @Override
    public void eat() {
        System.out.println("吃蟲子");
    }
}