import java.util.Scanner;

public class HJ07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        System.out.println(quZheng(f));
    }
    public static int quZheng(float f){
        float temp=f-(int)f;
        if (temp>=0.5){
          return (int)(f+1);
        }
        return (int)f;
    }
}
