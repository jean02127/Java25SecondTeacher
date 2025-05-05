package lesson3;

public class SedanV3 extends Car {
    public SedanV3(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    /*
     * 覆寫條件:名稱、數量、型別都要相同
     * 1.子類別的 方法名稱 須跟父類別的 方法名稱 相同
     * 2.子類別方法 須跟父類別方法 同樣數量的輸入參數
     * 3.子類別的 方法型別 須跟父類別的 方法型別 相同
     * 若沒遵照以上，會變成子類別的新方法
     */
    @Override //覆寫的註解
    public void wiper(){  //此為覆寫
        String getCarName = super.getName();
        System.out.println(getCarName + "(覆寫)尊榮版本");  
        System.out.println(getCarName + "(覆寫)加強版的新功能: 噴水雨刷");  
    }

    public void wiper(String plus){  //此為新方法(因參數不同)
        String getCarName = super.getName();
        System.out.println(getCarName + "(新方法)威力版本的新功能: 噴水雨刷");  
    }

    /*
     * 課堂覆寫練習
     */
    @Override
    public void getMaxSpeed() {
        String getCarName = super.getName();
        System.out.println(getCarName + "(課堂覆寫練習)加價會有更大馬力的速度");
    }
}