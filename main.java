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

// LC 349

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] map = new int[1001];
        List<Integer> result = new LinkedList<>();
        for(int i : nums1){
            map[i] ++;
        }
        for(int i : nums2){
            if(map[i] != 0){
                if(!result.contains(i)){
                    result.add(i);
                }
            }
        }  
        int[] res = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            res[i] = result.get(i);
        }
        return res;
    }
}
