class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        ArrayList<Character> anarg = new ArrayList<>();
        ArrayList<Character> anarg2 = new ArrayList<>();
        
        char a[] = s.toCharArray();
        for(int i = 0; i < a.length; i++){
            anarg.add(a[i]);
        }
        Collections.sort(anarg);
        char b[] = t.toCharArray();
        for(int i = 0; i < b.length; i++){
            anarg2.add(b[i]);
        }
        Collections.sort(anarg2);
        for(int i = 0; i < anarg.size(); i++){
            if(!anarg.get(i).equals(anarg2.get(i))){
                return false;
            }
            
        }
        return true;
       }
    }

    
