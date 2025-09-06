//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1754569089/

public class FindNum {
    public static void main(String[] args) {
        int[] nums = {21, 5674, 890, 3121, 5, 44};
        System.out.println(FindNumbers(nums));  // Call method and print result
    }

    static int FindNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count; 
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;   // simpler return
    }

    static int digits(int num) {
        if(num<0){
            num=num* -1;
        }
        if(num==0){
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;   // FIX: return digit count
    }
}
