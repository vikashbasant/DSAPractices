package hackerrank;

import java.util.ArrayList;

class MapNode<K, V> {
    K key;
    V value;
    MapNode<K, V> next;

    public MapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

class Map<K, V> {

    ArrayList<MapNode<K, V>> buckets;
    int count;
    int numBuckets;

    // constructor is called:
    public Map() {

        buckets = new ArrayList<>();
        numBuckets = 20;
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(null);
        }

    }

    /*------------------hashcode of key -----------------*/
    // Timecomplexity: O(L) where L is the length of string:
    private int getBucketIndex(K key) {
        int hc = key.hashCode();
        int index = hc % numBuckets;
        return index;
    }

    /*------------------size of the hashMap-----------------*/
    // Timecomplexity: O(1)
    public int size() {
        return count;
    }

    /*------------------insert into the hashMap-----------------*/
    // Timecomplexity: O(L+N) where L is the length of string, N is nothing but time taking for iteration of linked list.
    // O(L)<<O(N), because string length maximum 5 to 6. So it is constant.
    // Overall timecomplexity of insert function:O(N)
    public void insert(K key, V value) {

        // First We find index for our key:
        int bucketIndex = getBucketIndex(key);


        // Now check the which head of linked list present at that index;
        MapNode<K, V> head = buckets.get(bucketIndex);

        
        // Now we will traverse the linked list:
        // create 'temp' which store reference of 'head':
        MapNode<K, V> temp = head;
        while (temp != null) {
            // In String: == is compare the address of the string.
            // .equals() function compare the content of that address.

            // अगर key already present linked list मे है| तो सिर्फ उस key का सिर्फ value को अपडेट करेंगे linked list के अंदर।
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            // iterate over the linked list so we can do head = head.next:
            temp = temp.next;
        }
        // अगर key already present नहीं है linked list मे तो एक newNode बनाऊंगा और newNode.next में head डालूंगा |
        head = buckets.get(bucketIndex);
        MapNode<K, V> newNode = new MapNode<>(key, value);
        newNode.next = head;
        // then newNode को उस buketIndex पर रखूँगा |
        buckets.set(bucketIndex, newNode);
        // then count is simply increased.
        count++;
    }


    /*------------------getValue into the hashMap-----------------*/
    // Timecomplexity: O(L+N) where L is the length of string, N is nothing but time taking for iteration of linked list.
    // O(L)<<O(N), because string length maximum 5 to 6. So it is constant.
    // Overall timecomplexity of getValue function:O(N)
    public V getValue(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        // if key is present in the hashmap then return its value:
        while (head != null) {
            // if head.key is equal to our key that means key is present in the hashmap so we can return key's value:
            if (head.key.equals(key)) {
                return head.value;

            }
            head = head.next;
        }
        // if key is not present in the hashmap then return null:
        return null;
    }


    /*------------------removeKey into the hashMap-----------------*/
    // Timecomplexity: O(L+N) where L is the length of string, N is nothing but time taking for iteration of linked list.
    // O(L)<<O(N), because string length maximum 5 to 6. So it is constant.
    // Overall timecomplexity of removeKey function:O(N)
    public V removeKey(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        MapNode<K, V> prev = null;
        // Here we need to check if key is present in the hashmap or not:
        while (head != null) {
            // If key is present in the hsahmap then simply update head of the that index:
            if (head.key.equals(key)) {
                // If previous is null means first node linked list are removed.
                if (prev != null) {
                    prev.next = head.next;
                } else {
                    buckets.set(bucketIndex, head.next);
                }
                count--;
                return head.value;

            }
            prev = head;
            head = head.next;
        }
        return null;
    }
}


public class Programmer {

}

