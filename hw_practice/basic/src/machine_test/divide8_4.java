package machine_test;

import java.util.Scanner;

public class divide8_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            if (line.length()%8!=0){
              line = line + "00000000";
            }
            while(line.length()>=8){
                System.out.println(line.substring(0,8));
                line = line.substring(8);
            }
        }
    }
}
