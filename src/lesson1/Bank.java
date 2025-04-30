package lesson1;
public class Bank {
    private String account;
    private int balance1 = 0;

    public Bank(String registerAccount, int inputBalance) {
        this.account = registerAccount;
        this.balance1 = inputBalance;
    }

    public void showBalance() {
        System.out.println(this.account + " balance: " + this.balance1);
    }

    //上面是private的屬性，下面使用窗口 get(讀取)和set(寫入)
    public String getAccount() {
        return this.account;
    }

    // public void setAccount(String account) {
    //     this.account = account;
    // }

    // 想像情境：修改帳號
    public void setAccount(String inputAccount, String newAccount) {
        if(inputAccount != this.account) {
            System.out.println("您的帳號輸入錯誤，無法繼續執行此更改");
        } else {
            this.account = newAccount;
        }
    }

    // 想像情境：回傳餘額
    public int getBalance1() {
        return this.balance1;
    }

    // 想像情境：存錢(deposit) / 提款(withdraw)
    public void setBalance1(String account, String action, int balance1) {
        if(account != this.account) {
            System.out.println("您的帳號輸入錯誤，無法繼續執行此交易");
        } else {
            // 存錢
            if(action == "deposit") {
                if(balance1 > 0) {
                    this.balance1 = this.balance1 + balance1; //現在的存款 = 原本的存款 + 存的錢
                } else {
                    System.out.println("存款金額需大於0");
                }
            }

            // 提款
            if(action == "withdraw") {
                if(this.balance1 >= balance1) {
                    this.balance1 = this.balance1 - balance1;
                } else {
                    System.out.println("您的餘額不足");
                }
            }
        }
    }
}
