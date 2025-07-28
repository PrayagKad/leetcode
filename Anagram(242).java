/*242. Valid Anagram
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false                
Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */

//:::::::::::::::::::::::::::::::::::::::::::::::::first logic     converted both strings to char array and then sorted them and converted them again to strings and then compared them
class Solution {
    public boolean isAnagram(String s, String t) {

        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String s2 = new String(s1);
        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        String t2 =  new String(t1);

        if(s2.equals(t2))  // lk
        {
            return true;
        }
        else 
        {
            return false;
        }


        
    }
}
