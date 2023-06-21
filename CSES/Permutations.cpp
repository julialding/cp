#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main() {
    int n; cin >> n;

    if (n <= 3 && n > 1) {
        cout << "NO SOLUTION";
        return 0;
    }

    else {
        for (int i = 1; i <= n; i++) {
            if (i%2 == 0) { cout << i << " "; }
        }
        for (int j = 1; j <= n; j++) {
            if (j%2 != 0) { cout << j << " "; }
        }
    }

    return 0;
}