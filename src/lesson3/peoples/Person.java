package lesson3.peoples;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age >= 0){
            this.age = age;
        } else {
            System.out.println("age需大於或等於0");
        }
    }

    public void introduce() {
        System.out.println("我是" + this.getName() + "，今年" + this.getAge() +"歲。");
    }

    // 只在getter、setter做讀寫，比較好統一修改
}