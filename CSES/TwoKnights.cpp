#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main() {
    ll n; cin >> n;
    for (int i = 1; i <= n; i++) {
        if (i == 1) { cout << 0 << endl; }
        else {
            ll ways = (pow(i,2)*(pow(i,2)-1))/2-((i-1)*(i-2)*4);
            cout << ways << endl;
        }
    }
    return 0;
}