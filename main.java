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

// LC 202

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> map = new HashSet<>();

        while(n != 1 && !map.contains(n)){
            map.add(n);
            n = happyHelper(n);
        }
        return n == 1;
    }
    public int happyHelper(int n){
        int sum = 0;
        while(n > 0){
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
//使用HashSet

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> map = new HashSet<>();
        int fast = n;
        int slow = n;
        do{
            fast = happyHelper(fast);
            fast = happyHelper(fast);
            slow = happyHelper(slow);
        }while(fast != slow);
        return fast == 1;
    }
    public int happyHelper(int n){
        int sum = 0;
        while(n > 0){
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
//快慢指针

// LC 1
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                res[0] = i;
                res[1] = map.get(temp);
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
