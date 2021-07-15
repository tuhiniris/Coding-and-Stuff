#include <iostream>
#include<algorithm>
typedef long long ll;
using namespace std;


ll func(string s,char md,char ao){
    
        ll n=s.length();
        ll cnt=0,tot=0,cntm=0,cntpo=0;
        char ch='k';
        for(ll i=n-1;i>=0;i--){
            if(s[i]==md){
                tot+=cntpo*tot+(cnt-cntpo)*cntm;
                ch=s[i];
                cntpo=cnt;
                cntm++;
            }
            if(s[i]==ao && ch==md){
                cnt++;
            }
        }
        return tot;
}

int main()
{
	ll t;cin>>t;
	while(t--){
	    string s;
        cin>>s;
        ll a=func(s,'M','O');
        ll b=func(s,'D','A');
        reverse(s.begin(),s.end());
	    cout<<min(func(s,'M','O'),a)+min(func(s,'D','A'),b)<<endl;
	}
}
