package machine_test;

import java.util.Scanner;

public class Number16To10_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            int i = Integer.parseInt(line.substring(2), 16);
            System.out.println(i);
        }
    }
}
