import java.io.*;
import java.util.*;

public class Merge {
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data) {
    mergesort(data,0,data.length-1);
  }
  private static void mergesort(int[]data,int lo,int hi) {
    System.out.println(lo+" "+hi);
    System.out.println(mid(lo,hi));
    int mid = mid(lo,hi);
    int[] left = converge(data,lo,mid);
    int[] right = converge(data,mid+1,hi);
    if (lo>=hi) return;
    mergesort(data,lo,mid);
    mergesort(data,mid+1,hi);
    merge(data,left,right);
    System.out.println(Arrays.toString(left));
    System.out.println(Arrays.toString(right));
  }
  private static void merge(int[] data,int[] left, int[] right) {

  }
  private static int mid(int lo,int hi) {
    return lo+(hi-lo)/2;
  }
  private static int[] converge(int[] data,int lo, int hi) {
    int[] con = new int[hi-lo+1];
    for (int i=0;i<=hi-lo;i++) {
      con[i]=data[lo+i];
    }
    return con;
  }
  public static void main(String[] args) {
    int[] data = {38,27,43,3,9,82,10};
    mergesort(data);
    System.out.println(Arrays.toString(data));
  }
}
