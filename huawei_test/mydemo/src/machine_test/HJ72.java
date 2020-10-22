package machine_test;

import java.util.Scanner;

public class HJ72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int anInt = scanner.nextInt();
            getResult();
        }
    }

    //百钱买百鸡
    public static void getResult() {
        for (int i = 0; i <= 20; i++) { //大公鸡数量从0到20
            for (int j = 0; j <= 33; j++) { //老母鸡数量从0到33
                int z = 100 - i - j; //小鸡数量表示
                if ((5 * i + 3 * j + z / 3) == 100 && z >= 0&&(z%3==0)) {
                    System.out.println(i +" " + j + " " + z);
                }
            }
        }
    }
}
