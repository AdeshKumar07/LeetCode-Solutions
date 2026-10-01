class Solution {
    public static boolean check(String word1,String word2){
        char[] w1=word1.toCharArray();
        char[] w2=word2.toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        return Arrays.equals(w1,w2);        
    }
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
        ans.add(words[0]);
        for(int i=1;i<words.length;i++){
            if(!check(ans.get(ans.size()-1),words[i])){
               ans.add(words[i]);
            }
        }
       
        return ans;
    }
}