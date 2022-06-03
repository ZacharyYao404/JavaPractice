package demo4;

import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student("lili",19));
        hs.add(new Student("lili",19));


        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        HashMap<String,String> map= new HashMap<String, String>() {

        };
        Set<Map.Entry<String,String>> set2 = map.entrySet();

    }
}
