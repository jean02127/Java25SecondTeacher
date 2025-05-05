package lesson3;

import lesson3.peoples.*;
import lesson3.animals.*;

public class Demo {
    public static void main(String[] args) {
        /*
         * 課堂練習:
         * 請寫出一個MessagePrinter類別
         * 裡面的Method一律用printMessage命名
         * 輸入為
         * 1. 一個String
         * 2. 兩個double
         * 3. 兩個int 一個String
         * 最後通通印出來驗證
         */

        MessagePrinter mp = new MessagePrinter();
        mp.printMessage("Hello World!");
        mp.printMessage(3.14, 2.71);
        mp.printMessage(21, 57, "Hello Java!");

        System.out.println("=========================================");
    
        /*
         * 繼承
         */
        // 先呼叫父母類別查看
        Car car1 = new Car("car1: ", 100);
        car1.getMaxSpeed();
        car1.wiper();

        Sedan sedan1 = new Sedan("car2: ", 110);
        sedan1.getMaxSpeed();
        sedan1.back();
        sedan1.wiper();

        SedanV2 sedan2 = new SedanV2("car3: ", 120);
        sedan2.getMaxSpeed();
        sedan2.light();
        sedan2.wiper();

        /*
         * 覆寫範例()
         * 原本Car類別有wiper()方法
         * SedanV3類別也新增一個wiper()方法
         * ()內的參數要跟父類別一樣
         */

        SedanV3 sedan3 = new SedanV3("car4: ", 130);
        sedan3.getMaxSpeed();
        sedan3.wiper();
        sedan3.wiper("plus");

        System.out.println("=========================================");

        /*
         * 課堂覆寫練習
         * 用SedanV3類別
         * 覆寫Car的getMaxSpeed()
         * 印出 "加價會有更大馬力的速度"
         */

        /*
         * 課間練習
         * 三個類別: Person(人) → Student(學生) → CollegeStudent(大學生)
         * Person:
         *    private String name;
         *    private int age;
         *    public void introduce() {
         *        System.out.println("我是 xxx，今年 xxx 歲。");
         *    }
         * 
         * Student:
         *    private String school;
         *    
         *    @Override
         *    public void introduce() {
         *        System.out.println("我是學生 xxx，今年 xxx 歲，就讀於 xxx。");
         *    }
         * 
         * CollegeStudent:
         *    private String major;
         *    
         *    @Override
         *    public void introduce() {
         *        System.out.println("我是大學生 xxx，今年 xxx 歲，就讀於 xxx，主修 xxx。");
         *    }
         */

        Person p1 = new Person("P1", 20);
        p1.introduce();

        Student stu1 = new Student("STU1", 15, "五福國中");
        stu1.introduce();

        CollegeStudent cstu1 = new CollegeStudent("CSTU1", 20, "高師大", "數學系");
        cstu1.introduce();

        System.out.println("=========================================");

        /*
         * 多型
         * 宣告都是Person類別(繼承最上面的源頭)
         * 但實際上是用Person或Student或CollegeStudent類別的物件
         * (這樣就可以用同一個方法來呼叫不同的物件)
         */

        Person stu2 = new Student("STU2", 15, "光華國中");
        // stu2.introduce();
        Person cstu2 = new CollegeStudent("CSTU2", 20, "高雄大學", "物理系");
        // cstu2.introduce();

        System.out.println("=========================================");

        Person[] allpersons = {  //歸類在Person下的都可以用(要用逗號隔開)
            stu2,  //也可以這樣寫，=上面的 stu2.introduce();
            cstu2,
            new Person("AP1", 20),
            new Student("AP2", 15, "忠孝國中"),
            new CollegeStudent("AP3", 20, "中山大學", "化學系"),
            new CollegeStudent("AP4", 20, "中山大學", "中文系"),
            new Student("AP5", 15, "鳳山國中"),
        };

        for(Person p: allpersons) {
            p.introduce();
        }

        System.out.println("=========================================");

        Student[] allstudents = {
            //new Person("P2", 20),  只能用自己或子孫，不能往上用
            new Student("NS1", 15, "忠孝國中"),
            new CollegeStudent("NS2", 20, "中山大學", "化學系"),
            new CollegeStudent("NS3", 20, "中山大學", "中文系"),
            new Student("NS4", 15, "鳳山國中"),
        };

        for(Student stu: allstudents) {
            stu.introduce();
        }

        System.out.println("=========================================");

        /*
         * 課堂練習：多型
         * Class: Animal
         * Dog & Cat 都繼承 Animal
         * 覆寫 speak()
         * 存入5個物件(object)到Animal型別的Array
         * 用foreach 做同樣的事情 speak()
         */

        Animal[] allAnimals = {
            new Dog(),  //new之前是類別，之後是物件
            new Cat(),
            new Animal(),
            new Dog(),
            new Cat()
        };

        for(Animal a: allAnimals) {
            a.speak();
        }
    }
}