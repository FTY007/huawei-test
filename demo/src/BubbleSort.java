
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {46,46518,41315,4112,1145};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                int temp;
                if (array[j]>=array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int num : array){
            System.out.println(num);
        }
    }
}
