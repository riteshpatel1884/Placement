A supermarket maintains a pricing
Example 1:
Input :
5244 -> Value of N
Output :
160 -> Price 

Explanation:
From the input above 
Product of the digits 5,2,4,4
5*2*4*4= 160
Hence, output is 160.


  
import java.util.*;
class practice{
   public static int function(int n) {
     
     int price = 1;
     while(n>0)
     {
      int temp = n%10;
      price = price*temp;
      n/=10;
     }
     return price;
   }


public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int[] arr = { 5,3,4,5,8,9};
  int n = arr.length;


  System.out.println(function(5244));
}
}

TC = O(log₁₀(n))
SC = O(1)
