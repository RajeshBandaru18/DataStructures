package Sorting_Techniques;

public class BubbleSort {
    public void sort(int arr[], int n)
    {
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("After Bubbl sort:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int arr [] = {5, 4, 3, 2, 1};
        int n = arr.length;
        BubbleSort obj = new BubbleSort();
        obj.sort(arr, n);
    }
}
