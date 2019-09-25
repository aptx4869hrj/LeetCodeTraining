/*
 * @lc app=leetcode id=1184 lang=java
 *
 * [1184] Distance Between Bus Stops
 */
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        //定义起点终点，起点一定比终点小
        if(start > destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        int count = 0;
        int sum = 0;
        for(int i = 0; i < distance.length; i++){
            if(start <= i && i < destination){
                count += distance[i];
            }
            sum += distance[i];
        }
        return Math.min(count, sum-count);
    }
}

