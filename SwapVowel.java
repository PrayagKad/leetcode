 /*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"  */


import java.util.*;

public class SwapVowel
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word or string to swap vowels");
        String sentence = scan.nextLine();

        Output obj1 = new Output();

         obj1.reverseVowel(sentence);
        


    }

}

class Output
{
    public void reverseVowel(String s)
    {
        String vowels = "aeiouAEIO";
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        while(start < end)
        {

            while(start < end && vowels.indexOf(word[start])== -1)
            {
                 start++;

            }

            while(start < end && vowels.indexOf(word[end]) == -1) //pointer end begins at the last position of sentence . from there it decrements until it finds a vowel
            {                                                      //if no vowel is found  vowels.indexOf(word[end]) returns -1;
                end--;
            }

            //swap vowels as now both pointers point to vowels
            char xyz = word[start];
            word[start] = word[end];
            word[end] = xyz;
        }
         String out = new String(word);
        System.out.println(out);
    }

}