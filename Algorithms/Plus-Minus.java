import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float positive =0;
        float negative =0;
        float zero =0;
        
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        for(int arr_i=0; arr_i < n; arr_i++){
            if(arr[arr_i] >0)
                positive++;
            else if(arr[arr_i] <0)
                negative++;
            else
                zero++;
        }
        
        System.out.printf("%.6f \n%.6f \n%.6f \n  ",positive/n, negative/n, zero/n);
        
    }
}
