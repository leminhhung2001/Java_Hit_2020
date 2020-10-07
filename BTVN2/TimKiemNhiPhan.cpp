#include<bits/stdc++.h>
using namespace std;
int main(){
    int n, an[100], m, bm[100], kq=0;
    cin >> n;
    for(int i=0; i<n; i++) cin >> an[i];
    sort(an, an+n);
    cin >> m;
    for(int i=0; i<m; i++) cin >> bm[i];
    for(int i=0; i<m; i++){
        int k = lower_bound(an, an+n, bm[i]) - an;
        kq += an[k] - bm[i];
    }
    cout << kq;


}
