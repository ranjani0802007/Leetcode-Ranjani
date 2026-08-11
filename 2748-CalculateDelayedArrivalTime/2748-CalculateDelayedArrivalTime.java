// Last updated: 8/11/2026, 2:14:49 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
       return (arrivalTime+delayedTime)%24;
    }
}