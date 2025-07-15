class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        int n=score.size();
        vector<pair<int,int>> res;
        for(int i=0;i<n;i++){
            res.push_back({score[i],i});
        }
        sort(res.rbegin(),res.rend());
        vector<string> fres(n);
        for(int i=0;i<n;i++){
            int idx=res[i].second;
            if(i==0) fres[idx]="Gold Medal";
            else if(i==1) fres[idx]="Silver Medal";
            else if(i==2) fres[idx]="Bronze Medal";
            else fres[idx] = to_string(i+1);
        }
        return fres;

        
        
    }
};