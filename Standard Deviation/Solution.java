import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] array = new double[n];
        for(int i=0;i<n;i++)
            array[i] = s.nextDouble();
        
        double mean = mean(array,n);
        //System.out.println(mean);
        double sum = squared_distance(array, n, mean);
        //System.out.println(sum);
        double std_dev = standard_deviation(sum, n);
        System.out.printf("%.1f",std_dev);
    }

    public static double mean(double[] array, int n){
        double mean = 0;
        for(int i=0;i<n;i++)
            mean += array[i];
        mean /= n;
        return mean;
    }

    public static double squared_distance(double[] array, int n, double mean){
        double sum =0;
        for(int i=0;i<n;i++){
            sum += Math.pow((array[i]-mean),2);
        }
        return sum;
    }

    public static double standard_deviation(double sum, int n){
        double std_dev = Math.sqrt((sum/n));
        return std_dev;
    }
}

