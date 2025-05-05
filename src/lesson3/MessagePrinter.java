package lesson3;

public class MessagePrinter {
    public void printMessage(String inputString){
        System.out.println("string: " + inputString);
    }

    public void printMessage(double inputDouble1, double inputDouble2){
        String r1 = "d1: " + inputDouble1 + " // d2: " + inputDouble2;
        System.out.println(r1);
    }

    public void printMessage(int inputInt1, int inputInt2, String inputString){
        String r1 = "i1: " + inputInt1 + " // i2: " + inputInt2;
        r1 = r1 + " // string: " + inputString;
        System.out.println(r1);
    }
    // 相同型別名稱(String inputString)，但位置不同(第一個第三個)，可用
}