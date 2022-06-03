package demo3;

import java.util.function.Function;

public class FunctionLambda {
    public static void main(String[] args) {
        method(str->Integer.parseInt(str)+10,i->i*=10);

        String str="Sam,10";
        int num= getAgeNum(str,s->s.split(",")[1],
                      s->Integer.parseInt(s),
                      s->s+=10);
        System.out.println(num);
    }
    static void method(Function<String,Integer> one,Function<Integer,Integer> two){
       int num = one.andThen(two).apply("10");
        System.out.println(num);

    }
    static int getAgeNum(String str,Function<String,String>ong,
                         Function<String,Integer> two,
                         Function<Integer,Integer>three){
        return ong.andThen(two).andThen(three).apply(str);
    }
}
