package demo4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("赵薇");
        list.add("张韶钢");
        list.add("张韶涵");
        list.add("王无忌");
        Stream<String> stream = list.stream();
        stream.filter(s->s.startsWith("张"))
              .filter(s->s.length()==3)
              .forEach(s-> System.out.println(s));
    }
}
