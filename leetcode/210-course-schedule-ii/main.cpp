class Solution {
public:
    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        unordered_map<int,list<int>>adj;
       
            for(int i=0;i<prerequisites.size();i++)
            {
                int u=prerequisites[i][0];
                int v=prerequisites[i][1];
                adj[v].push_back(u);
            }        
        
        vector<int>d(numCourses);

        for(auto i:adj)
        {
            for(auto j:i.second)
            {
                d[j]++;
            }
        }
        
        queue<int>q;
        for(int i=0;i<numCourses;i++)
        {
            if(d[i]==0)
            {
                q.push(i);
            }
        }            
        vector<int>ans;
        while(!q.empty())
        {  
            int front=q.front();
            q.pop();
            ans.push_back(front);
            for(auto i:adj[front])
            {
                d[i]--;
                if(d[i]==0)
                q.push(i);
            }
            
        }
        if(ans.size()==numCourses) return ans;
        return {};
    
    }
};
