package lesson3.animals;

public class Cat extends Animal {  // Cat類別繼承Animal類別
    
    public void mia() {
        System.out.println("貓在喵喵叫");
    }

    @Override
    public void speak() {
        System.out.println("動物發出聲音:貓在叫");
    }
}