class Solution5{
    public void summ(int[] arr, int start, int end) {
        if(start>=end) return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        summ(arr,start+1,end-1);
    }
}


public class ReversearrayusingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Solution5 s5 = new Solution5();
        s5.summ(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print(num);
        }
    }
}
