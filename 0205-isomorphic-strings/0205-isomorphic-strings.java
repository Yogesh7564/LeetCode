class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Character> map1=new HashMap<>();
        HashMap<Character, Character> map2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            //s->t mapping
            if(map1.containsKey(c1) && map1.get(c1)!=c2){
                return false;
            }

            if(map2.containsKey(c2) && map2.get(c2)!=c1){
                return false;
            }
            map1.put(c1,c2);
            map2.put(c2,c1);
        }
        return true;
    }
}

               //Optimized solution

/*class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] lastSeenS = new int[256];
        int[] lastSeenT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If their last seen positions differ, mapping is broken
            if (lastSeenS[c1] != lastSeenT[c2]) {
                return false;
            }

            // Store current index + 1 (1-based to distinguish from default 0)
            lastSeenS[c1] = i + 1;
            lastSeenT[c2] = i + 1;
        }

        return true;
    }
}
*/