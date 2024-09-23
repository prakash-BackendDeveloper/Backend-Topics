class Count {
    int value;

    synchronized void setValue(int value) {
        System.out.println(" Name: " + Thread.currentThread().getName());
        this.value = value;
        System.out.println(value);
        try {
            Thread.sleep(10000);
        } catch(Exception ex) {
            // some error
        }
        System.out.println(" Done: " + Thread.currentThread().getName());

    }
}

class A {

    Count c;

    A(Count c) {
        this.c = c;
    }

     void f() {

        this.c.setValue(100);

    }


     void f1() {

        this.c.setValue(200);

    }
}

public class ThreadTest {
    public static void main(String args[]) {
        Count c = new Count();
       // Count c1=new Count();
        A a1 = new A(c);
        A a2 = new A(c);

//        new Thread(new Runnable(){
//            public void run() {
//                a1.f();
//            }
//        }).start();

        Thread t1=new Thread(()->a1.f());
        t1.start();


        new Thread(new Runnable(){
            public void run() {
                a2.f1();
            }
        }).start();

    }
}