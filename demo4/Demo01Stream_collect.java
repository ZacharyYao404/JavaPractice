package demo4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Demo01Stream_collect {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("刘岩");
        list.add("大鹏");
        Stream<String> listStream = list.stream().filter(s->s.length()==3);
        List<String> names = listStream.collect(Collectors.toList());
        System.out.println(names);
    }
}
