//https://leetcode.com/problems/add-digits/

public class AddDigits {
    static public int addDigits(int num) {
        int n = num; //38
        int rem;
        int sum = 0;
        do {
            while (n > 0) {
                rem = n % 10; //8
                n = n / 10; //3
                sum += rem;
            }
            n = sum;
            sum = 0;
        } while(n >= 10);
        return n;
    }

    public static void main(String[] args) {
        //System.out.println(addDigits(38));
        System.out.println(addDigits(0));

    }
}

/*
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.
 */
