package rikkei.academy;

public class main {
    public static void main(String[] args) {
        int arr[] = {4,2,1,4,6,7,9};
        int max = 0;
        int max2 =0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max2 = max;
                max = arr[i];
            }
        }
        System.out.println("Số lớn thứ 2 mảng là: "+ max2);
    }
}
