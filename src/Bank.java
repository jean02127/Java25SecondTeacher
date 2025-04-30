public class Bank {
    private String account;
    private int balance1 = 0;

    public Bank(String registerAccount, int inputBalance) {
        this.account = registerAccount;
        this.balance1 = inputBalance;
    }

    public void showBalance() {
        System.out.println(this.account + "balance: " + this.balance1);
    }

    //上面是private的屬性，下面使用窗口 get(讀取)和set(寫入)
    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    // 想像情境：回傳餘額
    public int getBalance1() {
        return this.balance1;
    }

    // 想像情境：存錢
    public void setBalance1(int balance1) {
        if(balance1 > 0) {
            this.balance1 = this.balance1 + balance1;
        } else {
            System.out.println("存款金額必須大於0");
        }
        //現在的存款 = 原本的存款 + 存的錢
    }
}
