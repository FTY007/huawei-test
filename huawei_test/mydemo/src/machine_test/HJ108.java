package machine_test;

import java.io.IOException;
import java.util.Scanner;

public class HJ108 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //System.out.println("最大公约数为："+getMaxAndMin(a,b)[0]);
        System.out.println("最小公倍数为："+getMaxAndMin2(a,b)[1]);
    }
        //最小公倍数和最大公约数
        public static Integer[] getMaxAndMin(Integer a, Integer b){
            if (a>b){
                int temp = a;
                a=b;
                b=temp;
            }
            int max=1;
            for (int i = 1; i <= a; i++) {
                if (a%i==0&&b%i==0){//遍历求最大公约数
                    max=i;
                }
            }
            int min = a*b/max;//乘积除以最大公约数即为最小公倍数
            Integer[] resultInt = new Integer[]{max,min};
            return resultInt;
        }

    //最小公倍数和最大公约数
    public static Integer[] getMaxAndMin2(Integer a, Integer b) {
        int mutli = a*b;
       if (a>b){//保证小的值在前
           int temp = a;
           a=b;
           b=temp;
       }
       //辗转相除
       int mod ;
       while (a!=0){
         mod = b%a;
         b=a;
         a=mod;
       }
       int max = a;
       int min = mutli/b;

       return new Integer[]{max,min};
    }

}
