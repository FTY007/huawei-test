package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ60 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input=reader.readLine())!=null){
            Integer[] twoPrime = getTwoPrime(Integer.parseInt(input));
            System.out.println(twoPrime[0]);
            System.out.println(twoPrime[1]);
        }
    }

    public static Integer[] getTwoPrime(Integer num){
        Integer[] integers = new Integer[2];
        int mid = num/2;
        if (mid%2==0){
            mid-=1;
        }
        for (int i = mid; i >=3 ; i-=2) { //从1/2处向左递减
            if (isPrime(i) && isPrime(num - i)) {
                integers[0]=i;
                integers[1]=num-i;
                break;
            }
        }
        return integers;
    }

    //判断这个数是否为素数
    public static boolean isPrime(Integer num){
        for (int i = 2; i <=num/2 ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

}
