class Solution {
    public int digitFrequencyScore(int n) {
       int map=0;

       while(n>0){
        map+=n%10;
        n/=10;
       }
        return map;
    }
}