package hackerrank.contests._30DaysCode;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i < n; i++){
            System.out.print(arr[n - i - 1] +" ");
        }
        
        in.close();
    }

}
