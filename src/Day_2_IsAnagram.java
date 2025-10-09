public class Day_2_IsAnagram {
    public static boolean isAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        int [] alphabetFrequency = new int[26];
        for(int i = 0; i < s.length(); i++){
            alphabetFrequency[s.charAt(i) -'a']++;
            alphabetFrequency[t.charAt(i) -'a']--;
        }

        for(int element: alphabetFrequency){
            if(element != 0){
                return false;
            }
        }
        return true;
    }
}
