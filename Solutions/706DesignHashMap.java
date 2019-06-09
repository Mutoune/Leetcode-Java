import java.util.ArrayList;
import java.util.List;

public class MyHashMap {

    /** Initialize your data structure here. */
    private List<Integer> key;
    private List<Integer> value;

    public MyHashMap() {
        key = new ArrayList<>();
        value = new ArrayList<>();
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        if (this.key.contains(key)) {
            this.value.set(this.key.indexOf(key), value);
        } else {
            this.key.add(key);
            this.value.add(value);
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if (this.key.contains(key)) {
            return this.value.get(this.key.indexOf(key));
        } else return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if (this.key.contains(key)) {
            this.value.remove(this.key.indexOf(key));
            this.key.remove(this.key.indexOf(key));
        }
    }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.put(2, 1);
        hashMap.remove(2);
        System.out.println(hashMap.get(2));
    }

}
