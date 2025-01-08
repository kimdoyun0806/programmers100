#include <iostream>
#include <vector>
#include <queue>
#define MAX 100000 + 10
using namespace std;

vector <int> v[MAX];
int visited[MAX]; // 방문 여부
int parent_graph[MAX]; // 부모 노드 출력 배열

int N;
void BFS() {
    queue <int> q;
    visited[1] = true;
    q.push(1);
    
    while (!q.empty()) {
        int parent = q.front();
        q.pop();
        for (int i = 0; i < v[parent].size(); i++) {
            int child = v[parent][i];
            if (visited[child] == false) {
                visited[child] = true;
                parent_graph[child] = parent;
                q.push(child);
            }
        }
    }
}
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> N;
    for (int i = 0; i < N - 1; i++) {
        int a, b;
        cin >> a >> b;
        v[a].push_back(b);
        v[b].push_back(a);
    }
    BFS();
    for (int i = 2; i < N+1; i++) {
        cout << parent_graph[i] << "\n";
    }
    return 0;
}