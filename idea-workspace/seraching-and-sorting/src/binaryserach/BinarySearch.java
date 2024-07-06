package binaryserach;

public class BinarySearch {

    public static void main(String[] args) {

        int []arr = {2,5,8,12,15,22,31,38,46,55};

        int item = 25;

        int index = binarySearch(arr,item);

        System.out.println(item+ " found at index : "+index);


    }

    static int binarySearch(int []arr, int item){
        int p = 0;
        int r = arr.length-1;
        int q;
        while(p<=r){
            q=(p+r)/2;
            if (arr[q]==item){
                return q;
            } else if (arr[q]>item) {
                r=q-1;
            }
            else {
                p=q+1;
            }
        }
        return -1;

    }

}
