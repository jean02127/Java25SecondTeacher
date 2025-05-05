package lesson1;
public class DemoClass {
 
    public static void main(String[] args) {

        /*
         * 類別實作
         * car1是實作的物件 型別為Car
         */
        Car car1 = new Car("001", "blue");
        car1.showCarInfo();

        Car car2 = new Car("002", "red");
        car2.showCarInfo();

        new Car("003", "yellow").showCarInfo();

        System.out.println("=========================================");

        /*
         * 課間練習1(不使用建構子)
         * 建立類別Person
         * 屬性: name, age
         * 方法: showName(), showAge()
         */

        Person p3 = new Person();
        p3.inputName("A3");
        p3.inputAge(30);
        p3.showName();
        p3.showAge();

        System.out.println("=========================================");

        /*
         * 課間練習2
         * 設計衣服(Cloth)類別
         * logo、顏色(color)、尺寸(size)
         * 用非建構子方式直接設定值，並且印出 logo color size 等資訊
         */

        //方法3
        Cloth c1 = new Cloth();
        c1.logo = "Nike";
        c1.color = "black";
        c1.size = "M";
        System.out.println("Logo: " + c1.logo + ", Color: " + c1.color + ", Size: " + c1.size);
        
        // 方法1
        // Cloth c1 = new Cloth("Nike", "black", "M");
        // c1.showInfo();
        // c1.size = "L";
        // c1.showInfo();
        // c1.color = "white";
        // c1.showInfo();
        // System.out.println(c1.color);

        // 方法2
        //  c1.inputLogo("Nike");
        //  c1.inputColor("black");
        //  c1.inputSize("M");
        //  c1.showLogo();
        //  c1.showColor();
        //  c1.showSize();

        System.out.println("=========================================");

        /*
         * 封裝練習 Getter * Setter
         */

        // 想像情境：開戶並且存款1000
        Bank b1 = new Bank("jean2127", 1000);
        // 想像情境：顯示帳戶跟餘額
        b1.showBalance();

        b1.setBalance1("jean2127", "deposit", 5000);
        int myBalance = b1.getBalance1();
        System.out.println("存錢後的餘額: " + myBalance);

        b1.setBalance1("jean2127", "deposit", 0);
        int myBalance1 = b1.getBalance1();
        System.out.println("餘額: " + myBalance1);

        // 假裝帳號輸入錯誤
        b1.setBalance1("jean212700", "deposit", 0);
        int myBalance2 = b1.getBalance1();
        System.out.println("您的餘額: " + myBalance2);

        // 提款 4000
        b1.setBalance1("jean2127", "withdraw", 4000);
        int myBalance3 = b1.getBalance1();
        System.out.println("提款後的餘額: " + myBalance3);

        // 提款 3000
        b1.setBalance1("jean2127", "withdraw", 3000);
        int myBalance4 = b1.getBalance1();
        System.out.println("您的餘額: " + myBalance4);

        System.out.println("=========================================");

        /*
         * 課程練習: 請修改可以變更account
         * 一樣要注意需比對原帳號，正確才能做修正
         * 改完帳號後，分別用新舊帳號試試存錢或是提領操作
         */

        // 修改帳號
        b1.setAccount("jean2127", "mark1223");
        System.out.println(b1.getAccount());

        b1.setBalance1("jean2127", "deposit", 1000);
        int myBalance5 = b1.getBalance1();
        System.out.println("您的餘額: " + myBalance5);
        b1.setBalance1("mark1223", "deposit", 1000);
        int myBalance6 = b1.getBalance1();
        System.out.println("您的餘額: " + myBalance6);

        System.out.println("=========================================");

        /*
         * 課程練習: 請命名一個類別Student
         * 兩個私有屬性: score1, score2, teacherAccount
         * 請用 getter setter 存取 score1 跟 score2
         * setScore1 setScore2 內要檢查 teacherAccount是否為建構子時候的輸入老師帳號
         * 且輸入的score需為 0 ~ 100 之間 才能寫入
         * 不在此範圍的需跳出回應 "分數需在 0 ~ 100 之間"
         * getScore1 getScore2 內要檢查 teacherAccount是否為建構子時候的輸入老師帳號 才回傳score
         * 非老師帳號 可印出"老師帳號錯誤"且回傳-1
         */

        Student s1 = new Student("teacher1");
        // 假設老師帳號輸入錯誤 (score1)
        s1.setScore1("teacher12", 55);
        int score11 = s1.getScore1("teacher1");
        System.out.println("score1:" + score11);

        // 老師帳號輸入正確 (score1)
        s1.setScore1("teacher1", 55);
        int score12 = s1.getScore1("teacher1");
        System.out.println("score1:" + score12);

        // 老師帳號輸入正確 但是分數超過 0 ~ 100 (score2)
        s1.setScore2("teacher1", 101);
        int score21 = s1.getScore2("teacher1");
        System.out.println("score2:" + score21);

        // 老師帳號輸入正確 (score2)
        s1.setScore2("teacher1", 66);
        int score22 = s1.getScore2("teacher1");
        System.out.println("score2:" + score22);

        System.out.println("=========================================");

        /*
         * 多載介紹(Overload)
         */

        Printer p1 = new Printer();
        p1.show();
        p1.show(1);
        p1.show("Test1");
        p1.show("Test2", "Test3");
        p1.show("Test4", 2);

        System.out.println("=========================================");
        
        /*
         * 課堂練習:
         * 請大家產生一個 Area 類別
         * 產生Method 名稱為 cal()
         * 分別產出: 三角形面積計算、正方形面積計算、長方形面積計算、圓形面積計算
         */

        Area a1 = new Area();
        a1.cal(5, 10);
        a1.cal("長", 3, 2);
        a1.cal("正", 3, 3);
        a1.cal(9);
        a1.cal();

        System.out.println("=========================================");

        /*
         * 課堂練習:
         * 請大家在lesson1 產生以下 路徑資料夾  lesson1 > homework > traning
         * 在traning 內放 Employee 類別
         * Employee 請用 getter setter 存取 name
         * 最後在DemoClass 實作一個 Employee 物件 且印出 getName()
         */

        lesson1.homework.traning.Employee e1 = new lesson1.homework.traning.Employee();
        e1.setName("jean");
        System.out.println(e1.getName());

        lesson1.homework.traning.Employee e2 = new lesson1.homework.traning.Employee();
        e2.setName("mark");
        System.out.println(e2.getName());
    }
}