Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of 
its prior elements.
Note : 1st element of the array should be considered in the count of the result.
  
For example,
Arr[]={7,4,8,2,9}
As 7 is the first element, it will consider in the result.
8 and 9 are also t3.


// Method 1:
import java.util.*;
class practice{
   public static int function(int[] arr) {
     int n = arr.length;
     int counter =1;
     for (int i = 1; i < n; i++) {
      if(arr[i]>arr[i-1])
       counter++;
     }
     return counter;
   }


public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int[] arr = { 5,3,4,5,8,9};
  int n = arr.length;


  System.out.println(function(arr));
}
}

TC = O(N)
SC = O(1)


