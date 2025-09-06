/*Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]

 

Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.

  */


//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: saw the solution and then tried again to solve


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //create a map to store string lists
        Map<String, List<String>> nm = new HashMap<>();

        for(String a : strs)
        {
            char[] ca = a.toCharArray(); // convert string to char array
            Arrays.sort(ca); // sort the char array

            String n = String.valueOf(ca); //convert sorted char array to string 

            if(!nm.containsKey(n)) // check if the map already contains this new string 
            {
                nm.put(n , new ArrayList<>()); // if not add the new string as key 
            }
            nm.get(n).add(a); // now we get the same string and put the original string into value as both strings were initially same or late same after sorting 
        }


        return new ArrayList(nm.values()); // returns values of map as a array[[],[],[]]


    
