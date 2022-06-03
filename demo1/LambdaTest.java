package demo1;

public class LambdaTest {
    public static void main(String[] args) {
        Factory factory = new SubClass();
           factory= new Factory() {
                @Override
                public Object getObject() {
                return new User("www",16);
            };
        };
        User user01= (User)factory.getObject();
        System.out.println(user01);
        //3Lambda表达式
        factory=()->{
            return new User("李四",17);
        };
         User user02 = (User)factory.getObject();
        System.out.println(user02);
        factory=()->new User("张三",12);
        User user03 = (User)factory.getObject();
        System.out.println(user03);
        getUserFromFactory(()->{return new User("赵六",18);},"User");
    }

    public static User getUserFromFactory(Factory factory,String beanName){
          Object object = factory.getObject();
           if(object!=null&&object.getClass().getSimpleName().equals(beanName)){
               return (User)object;
           }
             return null;
    }
}
