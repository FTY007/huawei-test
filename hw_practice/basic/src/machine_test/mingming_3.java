package machine_test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class mingming_3 {
    public static void main(String[] args){
        //1.输入个数
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        //2.用集合装对应数字
        ArrayList<Integer> arrayList = new ArrayList<Integer>(i);
        //3.循环
        for (int k = 0; k < i; k++) {
            arrayList.add(scanner.nextInt());
        }

        //第二组数,
        int j = scanner.nextInt();
        for (int k = 0; k < j; k++) {
            arrayList.add(scanner.nextInt());
        }

        //4.去重+排序,转换成hashset再转回来
        HashSet<Integer> hashset_temp = new HashSet<Integer>(arrayList);
        arrayList  = new ArrayList<Integer>(hashset_temp);
        System.out.println(arrayList);

    }
}
