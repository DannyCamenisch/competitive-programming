//
//  main.cpp
//  K
//
//  Created by Danny on 16.01.21.
//

#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

int main() {
    int a, b;
    cin >> a >> b;
    
    if(a % 2 == 1 && b % 2 == 1) {
        cout << "IMPOSSIBLE";
        return 0;
    }
    
    if(a % 2 == 0) {
        string o1(a/2, 'A');
        string o2(b, 'B');
        string o3(a/2, 'A');
        cout << o1 << o2 << o3;
        return 0;
    }
    
    int i1 = a/2;
        
    string out(a, 'A');
    for(int i = 0; i < b/2; i++) {
        out.insert(out.begin() + i1, 'B');
        i1 = i1 + 1;
        out.insert(out.begin() + i1 + 1, 'B');
    }
    
    cout << out;

    return 0;
}
