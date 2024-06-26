package Sorting_Techniques;

public class SelectionSort {
    int temp;
    public void sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]< arr[min]){
                    min = j;
                }
            }
            // if(arr[i]>min){
            //     temp = arr[min];
            //     arr[min] = arr[i];
            //     arr[i] = temp;
            // }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After Selection sort: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[] = {7, 5, 9, 2, 8};
        SelectionSort obj = new SelectionSort();
        obj.sort(arr);
    }
}
