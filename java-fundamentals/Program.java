import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        int []arr = new int[100000];

        for (int i=0; i<arr.length; i++){
            arr[i]= (int)(Math.random()*1000+1);
        }

        long t1 = System.currentTimeMillis();
        int lar = arr[0];
        int slar = arr[1];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>lar)
            {
                slar = lar;
                lar = arr[i];
            }
            else if (arr[i]>slar && arr[i]!=lar)
                slar = arr[i];
        }
        System.out.println("Largest: "+lar);
        System.out.println("Second Largest: "+slar);
        long t2 = System.currentTimeMillis();

        long d1 = (t2-t1);
        System.out.println("Time Taken : "+d1+" secs");

        long st1 = System.currentTimeMillis();

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Largest: "+arr[arr.length-1]);
        System.out.println("Second Largest: "+arr[arr.length-2]);
        long st2 = System.currentTimeMillis();

        long d2 = (st2-st1);
        System.out.println("Time Taken : "+d2+" secs");

    }
    
}