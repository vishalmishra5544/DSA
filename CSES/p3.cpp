//repetitions
#include<bits/stdc++.h>
using namespace std;
int main(){
string s;
cin>>s;
int count=1,res=1;
for(int i=0;i<s.length()-1;i++){
if(s[i]==s[i+1]){count++;res=max(count,res);}
else{res=max(count,res);count=1;}
}
cout<<res<<'\n';
return 0;
}