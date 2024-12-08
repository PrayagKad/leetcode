
#include<iostream>
#include<string.h>

using namespace std;

string merge(string st1,string st2)
{
    int ino1 = st1.size();
    int ino2 =  st2.size();

    string result ="";

    for(int i = 0; i<ino1 ||i<ino2;i++)
    {
        if(i<ino1)
        {
            result = result + st1[i];
        }
        if(i<ino2)
        {
            result = result + st2[i];
        }
    }

    return result;
}

int main()
{
    string str1 , str2, ans;

    cout<<"enter the string u want to merge : \n"
    <<"first string : \n";
    cin>>str1;
    cout<<"second string :\n";
    cin>>str2;

    ans = merge(str1,str2);

    cout<<"merged alternate string is : \t"<<ans<<endl;


}