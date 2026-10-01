// Last updated: 10/1/2026, 9:37:52 AM
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> types=new HashSet<>();

        for(int candy:candyType){
            types.add(candy);
        }
        int differentTypes=types.size();
        int candiesForSister=candyType.length/2;

        return Math.min(differentTypes,candiesForSister);
    }
}