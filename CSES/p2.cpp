//missing number
#include<bits/stdc++.h>
using namespace std;
int main(){
long long int n;
cin>>n;
int arr[n-1];
long long int sum=0,s=0;
for(int i=0;i<n-1;i++){
cin>>arr[i];
sum+=arr[i];
}
for(int i=1;i<=n;i++) s+=i;
cout<<s-sum<<'\n';

return 0;
}