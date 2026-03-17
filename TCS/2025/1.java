Problem Statement –
A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of 
integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
Example 1 :
N=8 and arr = [4,5,0,1,9,0,5,0].
There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of 
Input :
8  – Value of N
[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline
 
Output:
4 5 1 9 5 0 0 0 


 // Method 1
import java.util.*;
class practice{
  public static int[] function(int[] arr){
    int n = arr.length;
    int[] ans = new int[n];
    int j=0;
    for(int i=0; i<n; i++){
      if (arr[i] != 0) {
        ans[j++] = arr[i];
      }
    }
    return ans;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {4,5,0,1,9,0,5,0};

    int[] result = function(arr);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}

TC = SC = O(N)


 // Method 2:
 import java.util.*;
class practice{
  public static int[] function(int[] arr){
    int n = arr.length;
    int i=0, j=n-1;
    while(i<j){
      if(arr[i]!=0);
       i++;
      if(arr[j]==0)
       j--;
      if(arr[i]!=arr[j])
       {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
        i++;
        j--;
       }
    }
    return arr;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {6,0,1,8,0,2};

    int[] result = function(arr);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}

TC = O(N)
SC = O(1)

// Method 3:
 import java.util.*;
class practice{
  public static int[] function(int[] arr){
    int n = arr.length;
    int counter=0;
    for(int i=0;i<n;i++){
      if(arr[i]!=0)
       arr[counter++] = arr[i];
    }
    for(int i = counter; i<n; i++){
      arr[i] = 0; 
    }
  
    return arr;
}
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {6,0,1,8,0,2};

    int[] result = function(arr);
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}

TC = O(N)
SC = O(1)
This approach Preserves relative order of non-zero elements and is the most efficient in both time and space
 
