package basic;
public class ConditionAndLoop {
    public static void main(String[] args) throws Exception {
        /*
         * 條件式
         * 
         * if (條件) {
         *     條件成立時執行的程式碼
         * } else {
         *     條件不成立時執行的程式碼
         * }
         */
        // int a = 2;
        // int b = 3;

        // if((a <= b)) {
        //     System.out.println("a 的確 <= b");
        // } else {
        //     System.out.println("a 沒有 <= b");
        // }

        // if((a == 2) && (b == 5)) {
        //     System.out.println("條件成立");
        // } else {
        //     System.out.println("條件不成立");
        // }

        // if((a == 2) || (b == 5)) {
        //     System.out.println("條件成立");
        // } else {
        //     System.out.println("條件不成立");
        // }

        // if( ((a == 2) && (b == 3)) || (b == 4) ) {  //括弧很重要
        //     System.out.println("條件成立");
        // } else {
        //     System.out.println("條件不成立");
        // }


        /*
         * else if
         * 
         * if (條件1) {
         *    條件1成立時執行的程式碼
         * } else if (條件2) {
         *    條件2成立時執行的程式碼
         * } else {
         *    條件1跟條件2都不成立時執行的程式碼
         * }
         */
        // int a = 2;

        // if(a == 2) {
        //     System.out.println("a : 2");
        // } else if(a == 3) {
        //     System.out.println("a : 3");
        // } else if(a == 4) {
        //     System.out.println("a : 4");
        // } else {
        //     System.out.println("a 為2,3,4以外的數字");
        // }

        // int a = 5;

        // if(a == 0) {
        //     System.out.println("a : 0");
        // } else if(a == 3) {
        //     System.out.println("a : 1");
        // } else if(a == 4) {
        //     System.out.println("a : 2");
        // } else {
        //     System.out.println("a 為0,1,2以外的數字");
        // }

        // String[] results = {
        //     "a : 0",
        //     "a : 1",
        //     "a : 2",
        //     "a 為0,1,2以外的數字",
        // };
        // System.out.println(results[0]);

        // 用is...else if... 判斷 學生分數
        // 如果分數超過90分 印出(超棒)
        // 如果分數80~90分 印出(很好)
        // 如果分數60~80分 印出(好)
        // 其他 印出(ok)

        // int score = 85;

        // if(score >= 90) {
        //     System.out.println("超棒");
        // } else if(score >= 80 && score < 90) {
        //     System.out.println("很好");
        // } else if(score >= 60 && score < 80) {
        //     System.out.println("好");
        // } else {
        //     System.out.println("ok");
        // }

        // int a = 14;
        // int b = 5;

        // if(b == 0) {
        //     System.out.println("分母不能為0");
        // } else {
        //     double quotiend1 = a / b ;
        //     double quotiend2 = a % b ;
        //     System.out.println(quotiend1);
        //     System.out.println(quotiend2);
        // }


        /*
         * 簡化if else 寫法
         * (條件) ? 條件成立時執行的程式碼 : 條件不成立時執行的程式碼
         */
        // int a = 2;
        // int b = 3;

        // String min = (a < b) ?  "A < B" :  "B > A";
        // int min = (a < b) ? "1" : "2"
        // System.out.println(min);

        /*
         * 這兩行 效果等於以下寫法
         */
        // if(a < b) {
        //     System.out.println("A < B");
        // } else {
        //     System.out.println("B > A");
        // }

        
        /*
         * for 迴圈
         * for (初始值; 進入迴圈條件; 增量/減量) {
         *     條件成立時執行的程式碼
         * }
         */
        // for(int index = 0; index <= 10; index +=2) {
        //     System.out.println(index);
        //     System.out.println(index+1);
        // }
              
        /*
         * 課間練習題1：設計一個99乘法
         * 2x1=2 2x2=4 ...
         * ...
         * 9x1=9 9x2=18 ...
         */
        // for(int x = 2; x <= 9; x++) {
        //     for(int y = 1; y <= 9; y++){
        //         System.out.print(x + "x" + y + "=" + x*y + " ");
        //     }
        //     System.out.println();
        // }

        // 不換行
        // System.out.println();
        // 換行
        // System.out.print();

        /*
         * 課間練習題1-1：不要印出2x2=4, 3x3=9, ... 9x9=81
         */
        // for(int x = 2; x <= 9; x++) {
        //     for(int y = 1; y <= 9; y++){
        //         if(x != y) {
        //             System.out.print(x + "x" + y + "=" + x*y + " ");
        //         }
        //     }
        //     System.out.println();
        // }

        /*
         * 課間練習題2：設計一個金字塔
         *    *
         *   ***
         *  *****
         * *******
         */
        // int ln = 4; //第N行
        // for(int x = 1; x <= ln; x++) {
        //     //System.out.print("*");

        //     // 先印空白
        //     for(int blank = 1; blank <= ln- x; blank++) {
        //         System.out.print(" ");
        //     }
        //     // 再印星星
        //     for(int star = 1; star <= (2 * x) - 1; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        /*
         * 課間練習題3：
         *    從1數到100
         *    遇到15的倍數輸出 "FizzBuzz"
         *    遇到5的倍數輸出 "Buzz"
         *    遇到3的倍數輸出 "Fizz"
         *    其他則輸出正常數字
         */

        // for(int i = 1; i <= 100; i++) {
        //     if((i % 15) == 0) {
        //         System.out.println("FizzBuzz");
        //     } else if((i % 5) == 0) {
        //         System.out.println("Buzz");
        //     } else if((i % 3) == 0) {
        //         System.out.println("Fizz");
        //     } else {
        //         System.out.println(i);
        //     }
        // }


        /*
         * for 迴圈 將array所有元素印出來範例
         * 元素長度可以用 array.length 取得
         * 可用Debug 觀察 index 的變化
         */
        // int[] bingo = {7, 22, 89, 55};
        // for(int index = 0; index < bingo.length; index ++) {
        // for(int index = 0; index <= bingo.length-1; index ++) {
        //     System.out.println(bingo[index]);
        // }

        /*
         * 課間練習題4：把bingo內的所有數字加總且印出
         */
        // int sum = 0;
        // int[] bingo = {7, 22, 89, 55, 88};
        // for(int index = 0; index <= bingo.length-1; index++) {
        //     sum = sum + bingo[index];
        // }
        // System.out.println(sum);

        /*
         * 課間練習題5：比大小
         */
        // int max = 0;
        // int[] bingo = {7, 22, 89, 55, 88};
        // for(int index = 0; index <= bingo.length-1; index++) {
        //     if(bingo[index] > max) {
        //         max = bingo[index];
        //     }
        // }
        // System.out.println(max);


        /*
         * for 迴圈 減量範例
         * 這裡的 index 會從10開始，然後每次減1，直到 index <= 0 為止
         * 可用Debug 觀察 index 的變化
         */
        // for(int index = 10; index > 0; index --) {
        //     System.out.println(index);
        // }


        /*
         * for each 迴圈 >> 將陣列裡所有項目列出來
         * for (資料型態 單一變數名稱 : 陣列變數名稱) {
         *      條件成立時執行的程式碼
         * }
         */
        String[] students = { "A1", "A2", "A3" };
        for (String stu : students) {
            System.out.println(stu);
        }

        /*
         * 這幾行 效果等於以下寫法
         */
        // String[] students = { "A1", "A2", "A3" };
        // for (int index = 0; index <= students.length - 1; index++) {
        //     System.out.println(students[index]);
        // }

        int[] level = { 1, 9, 3 };
        for (int le : level) {
            System.out.println(le);
        }

    }
}
