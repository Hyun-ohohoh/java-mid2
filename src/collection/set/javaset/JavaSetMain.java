package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {

        run(new HashSet<String>()); //O(1)
        run(new LinkedHashSet<String>()); //순서 보장 O(1)
        run(new TreeSet<String>()); //데이터 순서 O(log N)
    }

    private static void run(Set<String> set){
        System.out.println("set = " + set.getClass());
        
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){ //다음 값이 있는 지
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
