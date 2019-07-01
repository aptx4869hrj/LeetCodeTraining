/*
 * @lc app=leetcode id=264 lang=java
 *
 * [264] Ugly Number II
 */

 /**
  * 动态规划
    更新一个丑数后，就将原先三个数中最小的数替换成更新的这个丑数
  */
import java.util.ArrayList;

class Solution {
    public int nthUglyNumber(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        int count_2 = 0, count_3 = 0, count_5 = 0;

        System.out.println(arrayList.get(0));
        for (int i = 1; i < n;i++){
            int minValue = Math.min(Math.min(arrayList.get(count_2) * 2, arrayList.get(count_3) * 3), arrayList.get(count_5) * 5);
            if (minValue == arrayList.get(count_2) * 2)
                count_2++;
            if (minValue == arrayList.get(count_3) * 3)
                count_3++;
            if (minValue == arrayList.get(count_5) * 5)
                count_5++;
            arrayList.add(minValue);
        }

        return arrayList.get(n - 1);
    }
}

