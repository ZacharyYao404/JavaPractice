package demo4;

import java.util.*;
import java.util.stream.Stream;

public class Demo01GetStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream1= list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        //1
        Map<String,String> map1 = new HashMap<>();
        Set<String> keySet = map1.keySet();
        Stream<String> stream3 = keySet.stream();

        //2
        Map<String,String> map2 = new HashMap<>();
        Collection<String> values = map2.values();
        Stream<String> stream4 = values.stream();


        //3
          Map<String,String> map3 = new HashMap<>();
          Set<Map.Entry<String,String>> entries = map3.entrySet();
          Stream<Map.Entry<String,String>> stream5 = entries.stream();

          //4
        Integer[] arr={1,2,3,4,5};
        String[] arr2 ={"a","b","c"};
        Stream<Integer> stream6 =Stream.of(arr);
        Stream<String> stream7=Stream.of(arr2);
    }
}
