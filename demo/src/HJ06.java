import java.util.Scanner;

public class HJ06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            long anLong= scanner.nextLong();
            System.out.println(getPrime(anLong));
        }
    }

    public static String getPrime(long num){
        long start = 2;
        StringBuilder stringBuilder = new StringBuilder();
        while (start<=num){
            if (num%start==0){
                stringBuilder.append(start+" ");
                num=num/start;
            }else{
                start++;
            }
        }
        return stringBuilder.toString();
    }
}
