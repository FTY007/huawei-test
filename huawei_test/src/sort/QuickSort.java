package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {100,54,99,156,102,444,12,34,42,73};
        quickSort(arr,0, arr.length-1);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    //快速排序
    public static void quickSort(int[] array,int start,int end){
        //1.设置两个指针
        int low = start ;
        int high = end ;
        if (start >= end ){
            return;
        }
        //2.设定枢轴值为第一个数；
        int plotValue = array[start];
        //3.枢轴值归位
        while (low < high){
            //3.1 从右向左依次遍历，比枢轴值大就一直循环找
            while (low<high && plotValue < array[high]){
                --high;
            }
            //3.2 找到第一个小于枢轴值的数，和其交换
            int temp = array[low];
            array[low]= array[high];
            array[high] = temp;
            //3.3 从左向右依次遍历，比枢轴值小就一直循环找
            while (low<high && array[low] < plotValue){
                ++low;
            }
            //3.4 找到第一个大于枢轴值的数，和其交换
            int temp2 = array[low];
            array[low]= array[high];
            array[high] = temp2;
        }
        //4. 递归循环
        quickSort(array, start, low-1);
        quickSort(array, low+1, end);
    }

}
