//
//  main.cpp
//  C
//
//  Created by Danny on 16.01.21.
//

#include <iostream>
#include <vector>

using namespace std;

vector<int> num;

void run() {
    num.assign(7, 0);
    
    for(int i = 0; i < 7; i++) {
        int n;
        cin >> n;
        num[i] = n;
    }
    
    // 1000
    if(num[6] > 0) {
        string out(num[6], 'M');
        if(out.length() > 3) out.resize(3);
        cout << out;
    }
    
    // 900
    if(num[4] > 0 && num[6] > 3) {
        cout << "CM";
        num[5] = 0;
        if(num[4] > 1) num[4] = -1;
        else num[4] = 0;
    }
    
    // 500
    if(num[5] > 0)
        cout << "D";
    
    // 100
    if(num[4] > 0) {
        string out(num[4], 'C');
        if(out.length() > 3) out.resize(3);
        cout << out;
    }
    
    // 90
    if(num[2] > 0 && (num[4] > 3 || num[4] == - 1)) {
        cout << "XC";
        num[3] = 0;
        if(num[2] > 1) num[2] = -1;
        else num[2] = 0;
    }
    
    // 50
    if(num[3] > 0)
        cout << "L";
    
    // 10
    if(num[2] > 0) {
        string out(num[2], 'X');
        if(out.length() > 3) out.resize(3);
        cout << out;
    }
    
    // 9
    if((num[2] > 3 || num[2] == -1) && num[0] > 1) {
        cout << "IX";
        num[1] = 0;
        num[0] = 0;
    }
    
    // 5
    if(num[1] > 0)
        cout << "V";
    
    // 1
    if(num[0] > 0) {
        string out(num[0], 'I');
        if(out.length() > 3) out.resize(3);
        cout << out;
    }
}

int main() {
    run();
    return 0;
}
