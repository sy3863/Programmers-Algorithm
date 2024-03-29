import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length / 2;
        int[] uni_nums = Arrays.stream(nums).distinct().toArray(); // 중복 제거한 배열
        int uni_len = uni_nums.length;
        
        if(uni_len >= len){
            answer = len;
        } else {
            answer = uni_len;
        }
        return answer;
    }
}