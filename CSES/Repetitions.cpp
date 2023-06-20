#include <bits/stdc++.h>
using namespace std;
#define ll long long

int main() {
    string n; cin >> n;
    ll longest = 0;
    ll current = 1;

    for (int i = 1; i<n.length(); i++) {
        if (n[i]!=n[i-1]) {
            longest = max(current, longest);
            current = 0;
        }
        current++;
    }
    longest = max(current, longest);
    cout << longest;
    return 0;
}

/*
chndr1 solution

#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin >> s;
    s += "X";

    A T T C G G G A
          l r
    const int n = s.length();
    int l = 0;
    int r = 0;
    int ans = 0;

    while (l < n)
    {
        if (s[r] != s[l])
        {
            ans = max(ans, r - l);
            l = r;
        }
        r++;
    }
    cout << ans << "\n";
}

*/