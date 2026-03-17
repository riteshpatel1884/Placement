Airport security officials have confiscated several item of the passengers at the security check point. All the items have 
been dumped into a huge box (array). Each item possesses a certain amount of risk[0,1,2]. Here, the risk severity of the items 
represent an array[] of N number of integer values. The task here is to sort the items based on their levels of risk in the 
array. The risk values range from 0 to 2.

Example :
Input :
7  -> Value\[0] to arr[N-1], while input each element is separated by new line.

Output :
0 0 0 1 1 2 2  -> Element after sorting based on risk severity 

// Method 1:
  import java.util.*;
class practice{
   public static int[] function(int[] arr) {
    int n = arr.length;
    int z= 0, o=0, t=0;
    int k=0;
    for(int i =0;i <n;i++)
    {
      if(arr[i]==0)   z++;
      else if(arr[i]==1)   o++;
      else  t++;
    }
    while(k<z){
      arr[k++] = 0;
    }
    while(k<(z+o)){
      arr[k++] = 1;
    }
    while(k<n)
    {
      arr[k++] = 2;
    }
    return arr;
  }
  
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int[] arr = { 2, 1, 0, 2, 1, 0, 0, 1, 2, 0};
  int n = arr.length;
  int[] result = function(arr);
  
  for(int i=0;i<n;i++){
    System.out.print(result[i]+ " ");
  }
}
}

TC = O(N)
SC = O(1) due to inplace modification



  
// Method 2:
  import java.util.*;
class practice{
   public static int[] function(int[] arr) {
     int lo = 0, mid = 0, hi = arr.length - 1;

     while (mid <= hi) {
       if (arr[mid] == 0) {
         swap(arr, lo, mid);
         lo++;
         mid++;
       } else if (arr[mid] == 1) {
         mid++;
       } else {
         swap(arr, mid, hi);
         hi--;
       }
     }
     return arr;
   }

   public static void swap(int[] nums, int i, int j) {
     int temp = nums[i];
     nums[i] = nums[j];
     nums[j] = temp;
   }

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int[] arr = { 2, 1, 0, 2, 1, 0, 0, 1, 2, 0};
  int n = arr.length;
  int[] result = function(arr);
  
  for(int i=0;i<n;i++){
    System.out.print(result[i]+ " ");
  }
}
}

TC = O(N)
SC = 0(1)

This is the optimal single-pass method. It’s faster than the counting method (though both have O(n) time).
Works well even for large arrays since it uses constant space.
