//https://leetcode.com/problems/length-of-last-word/

public class LenOfLastWord {
    static public int lengthOfLastWord(String s) {
        //System.out.println(s.length());
        int i = s.length()-1; //last index
        //System.out.println(i);
        int space_count = 0;
        boolean flag = true;
        int count = 0;
        while (flag){
            if(i<0){
                break;
            }
            int c = (int) s.charAt(i);
            //System.out.println(s.charAt(i));
            if ((c > 96 && c < 123) || (c > 64 && c < 91)){
                count += 1;
            } else {
                if (count==0){
                    i--;
                    continue;
                }
                else {
                    flag = false;
                }
            }
            i--;
        }
        return count;
    }

    public static void main(String[] args) {
        //System.out.println(lengthOfLastWord("Hello World"));
        //System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        //System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord("a"));
    }
}

/*
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.


Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.


Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */
