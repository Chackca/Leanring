package 算法类.排序算法;

import org.junit.Test;

public class 插入排序 implements Sort{

    @Override
    public void executeSort(int[] data) {

    }
    /*
     * 直接插入排序
     */
    public static void insertionSort(int[] data){
        if(data == null) return;
        int now = 0;
        int index = 0;
        for (int i = 1; i < data.length; i++) {
            index = i;
            now = data[i];
            while (index>0&&data[index-1]>now) {
                data[index]=data[index-1];
                index--;
            }
            data[index] = now;
        }
    }

    @Test
    private void testInsertionSort(){
        int[] data = {5,4,3,1,2,6,10,7};
        insertionSort(data);
        System.out.print("数组插入排序：\t");
        for(int item: data){
            System.out.print(item);
            System.out.print('\t');
        }
        System.out.println();
    }


    //自己写的
    public static void insertionSort2(int[] data){
        if(data == null) return;
        int curValue = 0;
        int temp = 0;
        for (int i = 1; i < data.length; i++) {
            temp = i;
            curValue = data[i];
            while (temp-1>=0&&data[temp-1]>curValue) {
                swapUtil.swap(data, temp, temp-1);
                temp--;
            }
        }
    }
}
