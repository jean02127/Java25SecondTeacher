package lesson2;

public class Demo {
    public static void main(String[] args) {
        Animal a1 = new Animal(); // Animal類別的物件
        a1.speak(); // 呼叫Animal類別的speak()方法

        Dog d1 = new Dog(); // Dog類別的物件
        d1.speak(); // 呼叫Dog類別的speak()方法
        d1.bark(); // 呼叫Dog類別的bark()方法
        

        /*
         * 課堂練習
         * 新增Cat 類別 繼承Animal
         * 新增一個method:mia()
         * 印出 "貓在喵喵叫"
         */

        Cat c1 = new Cat(); // Cat類別的物件
        c1.speak(); // 呼叫Cat類別的speak()方法
        c1.mia(); // 呼叫Cat類別的mia()方法


    }
    
}
