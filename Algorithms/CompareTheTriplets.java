import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

	      int x = 0;
        int y = 0;
	
        int[] array1 = new int[3]; 
        int[] array2 = new int[3];
        
        for(int i = 0; i<3; i++){
            array1[i] = in.nextInt();
        }
        
        for(int j = 0; j<3; j++){
            array2[j] = in.nextInt();
        }
        
        for(int k = 0; k<3; k++){
            if (array1[k] > array2[k])
                x++;
            else if (array1[k] < array2[k]) 
                y++;
            
        }
