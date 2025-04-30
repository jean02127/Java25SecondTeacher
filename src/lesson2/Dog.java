package lesson2;

public class Dog extends Animal {  // Dog類別繼承Animal類別
    
    public Dog() {
        super(); // 呼叫父類別的建構子
        System.out.println("Dog建構子被呼叫");
    }
    
    
    public void bark() {
        System.out.println("狗在汪汪叫");
    }
    

    /*
     * 覆寫Override
     */
    
    @Override
    public void speak() { // 覆寫父類別的speak()方法
        System.out.println("動物發出聲音:狗在叫");
    }
}
