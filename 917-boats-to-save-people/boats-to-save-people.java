class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int s=0;
        int e=people.length-1;
        int c=0;
        
        while(s<=e){
            if(people[s]+people[e]<=limit){
                s++;
                e--;
            }
            else{
                e--;
            }
            c++;

        }
        return c;
    }
}