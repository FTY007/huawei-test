package machine_test;

import java.util.Scanner;

public class HJ76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int anInt = scanner.nextInt();
            getSequeOddNum(anInt);
        }
    }

    //尼科彻斯定理
    public static void getSequeOddNum(Integer m) {
        //遍历验证每个整数
        if (m == 1) {
            System.out.println(1);
        }
        for (int j = 3; j < 2147483647; j += 2) { //产生连续奇数
            int sum = 0;
            int start = 0; //序列开头
            for (int k = j; k <= j + (m - 1) * 2; k += 2) { //m次累加
                sum += k; //奇数往后累加
            }
            if (sum == Math.pow(m, 3)) { //判断是否满足定理
                start = j;
                String result = "";
                Integer[] integers =new Integer[m];
                for (int i = 0; i < m; i++) {
                    integers[i] =start;
                    start+=2;
                    result+=integers[i]+" ";
                }
                System.out.println(result);
                break;
            }
        }
    }
}
