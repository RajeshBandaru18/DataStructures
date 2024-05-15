package Sorting_Techniques;

public class InsertionSort {
    public void sort(int arr[], int n){
        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("After Insertion Sort:");
        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[] = {5, 4, 3, 2, 1};
        int n = arr.length;
        InsertionSort obj = new InsertionSort();
        obj.sort(arr, n);
    }
}
