import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] array = new double[n];
        double[] weight = new double[n];
        for(int i=0;i<n;i++){
            array[i] = s.nextDouble();
        }
        for(int i=0;i<n;i++){
            weight[i] = s.nextDouble();
        }        
        double weighted_mean = weighted_mean(array,weight,n);
        System.out.printf("%.1f",weighted_mean);

    }

    public static double weighted_mean(double[] array,double[] weight, int n){
        double num = 0, den = 0;
        for(int i=0;i<n;i++){
            num += array[i]*weight[i];
            den += weight[i];
            //System.out.println(num+"---"+den+"---"+array[i]+"---"+weight[i]);
        }
        num /= den;
        return num;
    }
}

