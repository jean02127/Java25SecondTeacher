// 課間練習1(不使用建構子)
// 類別
public class Person {
    // 屬性
    public String name;
    public int age;

    // 建構子(初始化)
    public Person() {

    }
    
    // 方法
    public void inputName(String name) {
        this.name = name;
    }

    public void inputAge(int age) {
        this.age = age;
    }

    public void showName() {
        System.out.println("name: " + this.name);
    }

    public void showAge() {
        System.out.println("age: " + this.age);
    }
}