#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main() {
    ll n; cin >> n;

    for (ll i = 0; i < n; i++) {
        ll x; // x is column
        ll y; 
        cin >> x >> y;

        ll largest = max(x, y);
        ll smallest = min(x, y);

        if (largest%2 != 0 && x >= y) {
            cout << (largest-1)*(largest-1) + smallest << endl;
        }
        else if (largest%2 != 0 && x < y) {
            cout << largest*largest - smallest + 1 << endl;
        }
        else if (largest%2 == 0 && x >= y) {
            cout << (largest)*(largest) - smallest + 1 << endl;
        }
        else {
            cout << (largest*largest) - (largest*2) + 1 + smallest << endl;
        }
    }
    return 0;
}