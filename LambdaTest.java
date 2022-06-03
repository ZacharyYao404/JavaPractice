public class LambdaTest {
    public static void main(String[] args) {
        Factory factory=new SubClass();
        factory=()->{
            return new User("张三",38);
        };
          User user2=  (User)factory.getObject();
        System.out.println(user2);
         User user3= getUserFormFactory(()->{return new User("wangwu",33);},"User");
        System.out.println(user3);
    }

    public static User getUserFormFactory(Factory factory, String beanName){
        Object obj = factory.getObject();
        if(obj!=null && obj.getClass().getSimpleName().equals(beanName)){
            System.out.println(obj.getClass().getSimpleName());
                  return (User)obj;
        }
        return null;
    }
    public static Factory getFactory(){
        return ()->{
            return new User("张三",38);
        };
    }
}
