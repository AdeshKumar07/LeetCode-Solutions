class Solution {
       public int[] findEvenNumbers(int[] digits) {   
        int n=digits.length;    
       Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j && j!=k && k!=i){
                        int d1=digits[i];
                        int d2=digits[j];
                        int d3=digits[k];
                       if(d1!=0 && d3%2==0){
                        int num=d1*100+d2*10+d3;
                        s.add(num);
                       }
                    }
                }
            }
        }
        List<Integer> list = new ArrayList<>(s);
        Collections.sort(list);
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}