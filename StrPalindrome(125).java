/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
  */

//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: solution is not best at complexity time and space;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String c = s.replaceAll("[^a-zA-Z0-9]","").replaceAll(" ","");
        String r = "";
        if(s == null)
        {
            return false;
        }
        for(int i = c.length()-1 ; i>=0;i--)
        {
            r = r + c.charAt(i);
        }
        if(r.equals(c) )
        {
            return true;
        }
        else{
            return false;
        }

    }
}
class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();

        int n = chars.length;
        int start = 0;
        int end = n - 1;

        while(start < end) {
            if(chars[start] >= 'A' && chars[start] <= 'Z') {
                chars[start] -= ('A' - 'a');
            }

            if(chars[end] >= 'A' && chars[end] <= 'Z') {
                chars[end] -= 'A' - 'a';
            }

            if((chars[start] < 'a' || chars[start] > 'z') && (chars[start] < '0' || chars[start] > '9')) {
                start++;
                continue;
            }

            if((chars[end] < 'a' || chars[end] > 'z') && (chars[end] < '0' || chars[end] > '9')) {
                end--;
                continue;
            }

            if(chars[start] != chars[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
