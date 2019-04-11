import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int j=0, q1=0, q2=0, q3=0;
        int[] array = new int[n];
        int[] array1 = new int[n/2];
        int[] array2 = new int[n/2];
        for(int i=0;i<n;i++)
            array[i] = s.nextInt();
        array = sort(array, n);
        q2 = median(array,n);
        if(n%2==0)
        {
            //System.out.println("In even");
            for(int i=0;i<n/2;i++){
                array1[i] = array[i];
            }
            for(int i=n/2;i<n;i++,j++){
                array2[j] = array[i];
            }
            q1 = median(array1,n/2);
            q3 = median(array2,n/2);
        }
        else
        {
            //System.out.println("In odd");
            for(int i=0;i<n/2;i++){
                array1[i] = array[i];
            }
            for(int i=(n/2)+1;i<n;i++,j++){
                array2[j] = array[i];
            }
            q1 = median(array1,n/2);
            q3 = median(array2,n/2);           
        }
        print(q1, q2, q3);
        
    }

    public static int[] sort(int[] array, int n) {
        for(int i=0;i<n;i++)
            for(int j=i+1; j<n;j++)
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        return array;
    }

    public static int median(int[] array, int n){
        int result =0;
        if(n%2==0){
            result = array[(n/2)-1] + array[n/2];
            result /= 2;
        }
        else{
            result = array[n/2];
        }
        return result;     
    }
    public static void print(int q1, int q2, int q3){
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }
}
