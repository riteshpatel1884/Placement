Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 
So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with 
any day, be it Sunday, Monday…. Or so on.
Count the number of Sunday jack will get within n number of days.

Ex
Input 
mon-> input String denoting the start of the month.
13  -> input integer denoting the number of days from the start of the month.

Output :
2    -> number of days within 13 days.
  
Explanation:
The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.
Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. 
Total 2 sundays may fall within 13 days.


// Method 1:
  import java.util.*;
class practice{
    public static int function(String startDay, int n) {
    String[] days = {"sun", "mon", "tue", "wed", "thu", "fri", "sat"};

    startDay = startDay.toLowerCase();

    // Find index of starting day
    int startIndex = 0;
    for (int i = 0; i < 7; i++) {
      if (days[i].equals(startDay)) {
        startIndex = i;
        break;
      }
    }

    int count = 0;
    int currentDay = startIndex;

    // Simulate each day in the month
    for (int i = 1; i <= n; i++) {
      if (days[currentDay].equals("sun")) {
        count++;
      }
      currentDay = (currentDay + 1) % 7; // move to next day
    }

    return count;
}
  
public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
  String startDay = sc.next(); // e.g., "mon"
  int n = sc.nextInt(); // e.g., 13

  int count = function(startDay, n);
  System.out.println(count);
}
}

TC = O(N) 
SC = O(N)

// Method 2:
import java.util.*;
class practice{
   public static int function(String startDay, int n) {
    // Map days to numbers (0 = Sunday)
    Map<String, Integer> dayMap = new HashMap<>();
    dayMap.put("sun", 0);
    dayMap.put("mon", 1);
    dayMap.put("tue", 2);
    dayMap.put("wed", 3);
    dayMap.put("thu", 4);
    dayMap.put("fri", 5);
    dayMap.put("sat", 6);

    startDay = startDay.toLowerCase();
    int start = dayMap.get(startDay);

    int daysUntilSunday = 7 - start;
    if (daysUntilSunday == 7)
      daysUntilSunday = 0;

    int count = 0;
    int firstSunday = daysUntilSunday + 1;

    for (int day = firstSunday; day <= n; day += 7) {
      count++;
    }

    return count;
  }
  
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String startDay = sc.next(); // e.g. "mon"
  int n = sc.nextInt(); // e.g. 13

  int result = function(startDay, n);
  System.out.println(result);
 }
}

TC = O(N)
SC = O(1)
