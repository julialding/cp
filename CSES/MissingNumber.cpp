#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main() {
    ll n; cin >> n;

    ll a[n];

    for(int i = 0; i < n - 1; i++) cin >> a[i];

    sort(a, a + (n - 1));

    for (int i = 0; i < n-1; i++) {
        if (i + 2 == a[i]) {
            cout << i + 1 << "\n";
            return 0;
        }
    }
    cout << n;
    return 0;
}