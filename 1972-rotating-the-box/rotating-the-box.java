class Solution {
    static void fill(char[][] res,int c,int x,int y){
        while(c>0){
            res[x][y]='#';
            x--;
            c--;
        }
    }
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m=boxGrid.length;
        int n=boxGrid[0].length;
        char[][] res=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]='.';
            }
        }
        for(int i=0;i<m;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(boxGrid[i][j] == '#') c++;
                else if(boxGrid[i][j] == '*'){
                    res[j][m-i-1]='*';
                    fill(res,c,j-1,m-i-1);
                    c=0;
                }
            }
            if(c>0){
                fill(res,c,n-1,m-i-1);
            }
        }
        return res;
    }
}