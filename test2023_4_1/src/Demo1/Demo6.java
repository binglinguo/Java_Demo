package Demo1;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-01 20:47
 **/
//跳跃游戏
public class Demo6 {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int max = 0;
        for(int i = 0;i < len; i++){
            if(max >= i){
                max = Math.max(max,i + nums[i]);
                if(max >= len){
                    return true;
                }
            }else {
                return false;
            }
        }
        return true;
    }
}
