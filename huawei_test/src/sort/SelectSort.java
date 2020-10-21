package sort;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {900,70,400,300,50,22,66,10};
        int[] newArr = selectSort(arr);
        for (int num:newArr){
            System.out.println(num);
        }
    }
    //选择排序
    public static int[] selectSort(int[] array){
        //1.大循环控制轮数
        for (int i = 0; i < array.length; i++) {
            //2.小循环进行每组排序，每轮进来后基准下标+1
            for (int j = i+1; j < array.length ; j++) {
                //3.比较并交换
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
