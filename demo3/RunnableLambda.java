package demo3;

public class RunnableLambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
               String name = Thread.currentThread().getName();
                System.out.println(name+"已经启动");
            }
        }).start();
    }
}
