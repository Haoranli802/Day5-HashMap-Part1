// LeetCode 242
 class Solution {
    public boolean isAnagram(String s, String t) {
        int[] map = new int [26];
        for(char c : s.toCharArray()){
            map[c - 'a'] ++;
        }
        for(char c : t.toCharArray()){
            if(map[c - 'a']-- == 0){
                return false;
            }
        }
        for(int i : map){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
// Time: O(N) Space: O(1)
