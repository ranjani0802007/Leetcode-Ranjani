// Last updated: 8/11/2026, 2:19:09 PM
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : deck)
            map.put(x, map.getOrDefault(x,0)+1);

        int g = 0;
        for(int c : map.values())
            g = gcd(g,c);

        return g > 1;
    }

    int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a%b);
    }
}