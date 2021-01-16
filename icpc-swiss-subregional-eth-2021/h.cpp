//
//  main.cpp
//  H
//
//  Created by Danny on 16.01.21.
//

#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;
    
    vector<int> a(n, 0);
    vector<int> b(n, 0);
    
    vector<int> c(n, 0);
    vector<int> d(n, 0);
    
    vector<int> r1(n, 0);
    vector<int> r2(n, 0);
    
    for(int i = 0; i < n; i++) {
        int p;
        cin >> p;
        a[i] = p;
    }
    
    for(int i = 0; i < n; i++) {
        int p;
        cin >> p;
        b[i] = p;
    }
    
    for(int i = 0; i < n; i++) {
        int p;
        cin >> p;
        c[i] = p;
    }
    
    for(int i = 0; i < n; i++) {
        int p;
        cin >> p;
        d[i] = p;
    }
    
    for(int i = 0; i < n; i++) {
        if(b[i] < c[i]) {
            r1[i] = b[i];
            r2[i] = c[i];
        } else if(a[i] > d[i]) {
            r1[i] = a[i];
            r2[i] = d[i];
        } else {
            if(b[i] < d[i]) {
                r1[i] = b[i];
                r2[i] = b[i];
            } else {
                r1[i] = d[i];
                r2[i] = d[i];
            }
        }
    }
    
    cout << r1[0];
    for(int i = 1; i < n; i++) {
        cout << " " << r1[i];
    }
    
    cout << "\n" << r2[0];
    for(int i = 1; i < n; i++) {
        cout << " " << r2[i];
    }
        
    return 0;
}
