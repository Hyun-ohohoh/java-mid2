package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity){
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value){
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex]; //O(1)
        if(bucket.contains(value)){ //O(n) -> O(1) 데이터가 1개만 2
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchValue){
        int hashIndex = hashIndex(searchValue); //O(1)
        LinkedList<Object> bucket = buckets[hashIndex]; //O(1)
//        for (Object object : bucket) {
//            if(object.equals(searchValue)){
//                return true;
//            }
//            return false;
//        }
        return bucket.contains(searchValue); //O(n) -> O(1) 데이터가 1개만 2
    }

    public boolean remove(Object value){
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hashIndex(Object value){
        return Math.abs(value.hashCode()) % capacity;
        //해시코드 호출 후 양수로 바꾸고 계산
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
