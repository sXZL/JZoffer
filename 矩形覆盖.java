// 题目描述
// 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？


// 类似于跳台阶.java
// 也是用的斐波那契数列的思想

public class Solution {
    public int RectCover(int target) {
      if(target  <= 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }else if(target == 2){
            return 2;
        }else{
            return RectCover((target-1))+RectCover(target-2);
        }
    }
}