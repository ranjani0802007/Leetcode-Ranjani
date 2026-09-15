// Last updated: 9/15/2026, 4:28:27 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
       return (arrivalTime+delayedTime)%24;
    }
}