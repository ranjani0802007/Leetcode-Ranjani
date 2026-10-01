// Last updated: 10/1/2026, 9:39:08 AM
import java.util.*;

class RandomizedSet {

    ArrayList<Integer> list = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    Random random = new Random();

    public RandomizedSet() {}

    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;

        map.put(val, list.size());
        list.add(val);

        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;

        int index = map.get(val);
        int last = list.get(list.size() - 1);

        list.set(index, last);
        map.put(last, index);

        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}