//
//  main.cpp
//  D
//
//  Created by Danny on 16.01.21.
//

#include <iostream>
#include <queue>

using namespace std;

vector<bool> v;
vector<vector<int>> g;
vector<int> d;

void bfs(int s) {
    queue<int> q;
    
    q.push(s);
    v[s] = true;

    while (!q.empty()) {
        int a = q.front();
        q.pop(); //delete the first element form queue

        for (auto j = g[a].begin(); j != g[a].end(); j++) {
            if (!v[*j]) {
                v[*j] = true;
                d[*j] = d[a] + 1;
                q.push(*j);
            }
        }
    }
    
    int shift1 = 0;
    int shift2 = 0;
    vector<int> s1;
    vector<int> s2;
    s1.assign(0, 0);
    s2.assign(0, 0);
    
    for(int i = 0; i < d.size(); i++) {
        if(d[i] % 2 == 0) {
            shift1++;
            s1.push_back(i);
        } else {
            shift2++;
            s2.push_back(i);
        }
    }
    
    cout << shift1;
    
    for(int i = 0; i < shift1; i++) {
        cout << " " << s1.at(i);
    }
    
    cout << "\n" << shift2;
    
    for(int i = 0; i < shift2; i++) {
        cout << " " << s2.at(i);
    }
    
}

int main(int argc, const char * argv[]) {
    int n, m;
    cin >> n;
    cin >> m;
    
    v.assign(n, false);
    d.assign(n, 0);
    g.assign(n, vector<int>());
    
    for(int i = 0; i < m; i++) {
        int u, v;
        cin >> u;
        cin >> v;
        
        g[u].push_back(v);
        g[v].push_back(u);
    }
    
    bfs(0);
    
    return 0;
}
