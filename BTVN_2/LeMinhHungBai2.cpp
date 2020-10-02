#include<bits/stdc++.h>
using namespace std;
int main(){
    int n, m;
    cin >> n >> m;
    int dem=0;
    while(1){
        n *= 3;
        m *= 2;
        dem++;
        if(n - m > 0){
            break;
        }
    }
    cout << dem;
}

