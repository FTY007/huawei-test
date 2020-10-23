package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HJ14 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        if (1000<row||row<1){
            return;
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        String word;
        while((word=reader.readLine())!=null){
            arrayList.add(word);
            if (arrayList.size()==row){
                Collections.sort(arrayList);
                for (String s : arrayList) {
                    System.out.println(s);
                }
                break;
            }
        }
    }
}
