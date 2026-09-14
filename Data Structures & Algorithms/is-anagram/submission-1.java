class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            //s
            char c1 = s.charAt(i);
            if(!map1.containsKey(c1)){
                map1.put(c1, 1);
            }
            map1.put(c1, map1.get(c1) + 1);

            //t
            char c2 = t.charAt(i);
            if(!map2.containsKey(c2)){
                map2.put(c2, 1);
            }
            map2.put(c2, map2.get(c2) + 1);

        }
        
        if (map1.equals(map2)){
            return true;
        }
        return false;
    }   
}
