package machine_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HJ40 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line= bufferedReader.readLine())!=null){
            List<Integer> list = count(line);
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }
    public static List<Integer> count(String line){
        char[] chars = line.toCharArray();
        int letterNum=0;
        int emptyNum=0;
        int numberNum=0;
        int otherNum=0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLetter(c)){
                letterNum++;
            }else if (Character.isSpaceChar(c)){
                emptyNum++;
            }else if ('0'<=c&&c<='9'){
                numberNum++;
            }else {
                otherNum++;
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(letterNum);
        arrayList.add(emptyNum);
        arrayList.add(numberNum);
        arrayList.add(otherNum);
        return arrayList;
    }
}
