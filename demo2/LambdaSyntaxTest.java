package demo2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaSyntaxTest {
    public static void main(String[] args) {
      IMathOperation mo0 = (int a,int b)-> a+b;
        System.out.println(mo0.operation(10,12));
        IGreeting iGreeting = a-> System.out.println("hello"+a);
        iGreeting.sayHello(",world");
        IMathOperation mo1 = (int a,int b)->a+b;
        System.out.println(mo1.operation(1,2));
    }
}
