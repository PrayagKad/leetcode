''
/* /Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""*/

#include<iostream>
#include<algorithm>
#include<bits/stdc++.h>
#include<numeric>

using namespace std;

string gcdString(string st1, string &st2)
{
    if(st1 + st2 != st2 +st1)
    {
        return "";
    }

    else
    {
        return (st1.substr(0, __gcd(st1.size( ),st2.size( ))));

    }
}


int main()
{
    string str1,str2;

    cout<<"enter strings  : \n";
    cin>>str1;
    cin>>str2;

    string ans = "";

    ans = gcdString(str1,str2);

    cout<<ans;

}