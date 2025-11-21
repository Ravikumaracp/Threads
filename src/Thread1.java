class X implements Runnable{
    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Y implements Runnable{
    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Thread1 {
    public static void main(String[] args){
        X obj1=new X();
        Y obj2=new Y();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }


}
