//Increasing Array
#include<bits/stdc++.h>
using namespace std;
int main(){
long long int n;
cin>>n;
long long int arr[n];
for(int i=0;i<n;i++){cin>>arr[i];}
long long int diff=0;
for(int i=0;i<n-1;i++){
 if(arr[i]>arr[i+1]){diff=diff+arr[i]-arr[i+1];arr[i+1]+=(arr[i]-arr[i+1]);}
}
cout<<diff<<'\n';
return 0;
}