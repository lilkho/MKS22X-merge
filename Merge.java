import java.io.*;
import java.util.*;

public class Merge {
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data) {
    mergesort(data,0,data.length-1);
  }
  private static void mergesort(int[]data,int lo,int hi) {
    if (lo>=hi) return;
    int[]temp=data;
    System.out.println(Arrays.toString(temp));
    mergesort(temp,lo,mid(lo+1,hi+1));
    mergesort(temp,mid(lo+1,hi+1),hi);
  }
  private static int mid(int lo,int hi) {
    if (hi-lo%2==0) return hi-lo/2;
    else return hi-lo/2 +1;
  }

  public static void main(String[] args) {
    int[] data = {38,27,43,3,9,82,10};
    mergesort(data);
    System.out.println(7/2);
    System.out.println(Arrays.toString(data));
  }
}
