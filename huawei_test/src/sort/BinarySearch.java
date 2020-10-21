package sort;

import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{12,24,32,44,44,55,55,87,98,98,98};
        ArrayList<Integer> resultList = binarySearch(array, 0, array.length - 1, 98);
        System.out.println(resultList.toString());
    }

    //二分法查找
    public static ArrayList<Integer> binarySearch(int[] arr, int start,int end,int target) {
        //1.查询结束：左起点大于右起点
        if (start>end){
            return new ArrayList<Integer>();
        }
        int mid = (start+end)/2;
        //2.目标值比中点值小，缩小范围循环查找
        if (target < arr[mid]){
            return binarySearch(arr,start,mid-1,target);
        }
        //3.目标值比中点值大，缩小范围循环查找
        if (target > arr[mid]) {
            return binarySearch(arr, mid+1, end, target);
        }
        //4.1目标值等于中点值
        ArrayList<Integer> resultList= new ArrayList<Integer>();
        resultList.add(mid);
        //4.2向左查找有无重复的目标值,查找范围0至mid-1
        int temp = mid-1;
        while (temp>=0&&target==arr[temp]){
                resultList.add(temp);
                temp-=1;
        }
        //4.2向右查找有无重复的目标值，查找范围mid+1至结尾
        temp = mid+1;
        while (temp < arr.length&&target==arr[temp]){
                resultList.add(temp);
                temp+=1;
        }
        return resultList;
    }
}
