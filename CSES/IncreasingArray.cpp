#include <bits/stdc++.h>
using namespace std;
#define ll long long 

int main() {
    ll n; cin >> n;
    ll a[n];
    ll diff = 0;
    ll sum = 0;
    for (int i = 0; i < n; i++) { cin >> a[i]; }

    for (int i = 1; i < n; i++) {
        if (a[i] < a[i-1]) {
            diff = a[i-1]-a[i]; 
            sum += diff;
            a[i] += diff;
        }
    }
    cout << sum << "\n";
    return 0;
}

/*
chndr1 solution
#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main()
{
    ll n;
    cin >> n;
    ll a[n];
    for (ll i = 0; i < n; i++)
        cin >> a[i];

    ll ans = 0;
    ll cur = 0;

    for (ll i = 0; i < n - 1; i++)
    {
        cur = max(cur, a[i]);
        ans += (max((ll)(0), cur - a[i + 1]));
    }
    cout << ans << "\n";
}
*/
// 5 6 2 4 6 7 7
// 5 6 6 6 6 7 7 