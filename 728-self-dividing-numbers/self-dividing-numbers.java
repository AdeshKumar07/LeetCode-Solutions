class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        //here creating a Array list for storing ele which divisible by itself
        List<Integer> divx=new ArrayList<>();
        //itrating each element in range of left to rigth
        for(int i=left;i<=right;i++){
           int num=i;

           boolean div=true;   //declearinig a statement for checking 
           while(num>0){ // finding last and checking it divisibility conditon 
            int l=num%10;
            if(l==0 || i % l != 0){ // handeling case if if last is 0 or if its fails ot given condition 
                div=false;
                break;
            }
            num=num/10;
           }
           //if divisibililyt condition is true then add that ele in arrayList 
            if(div){
                divx.add(i);
            }

                
        }
        return divx;
       
    }
}