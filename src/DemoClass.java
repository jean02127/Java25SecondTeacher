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

        /*
         * 課間練習3
         */

        // 想像情境：開戶並且存款1000
        Bank b1 = new Bank("jean2127 ", 1000);
        // 想像情境：顯示帳戶跟餘額
        b1.showBalance();

        b1.setBalance1(5000);
        int myBalance = b1.getBalance1();
        System.out.println("存錢後的餘額: " + myBalance);

        b1.setBalance1(0);
        int myBalance1 = b1.getBalance1();
        System.out.println("存錢後的餘額: " + myBalance1);
    }
}
