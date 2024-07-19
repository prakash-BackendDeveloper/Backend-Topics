class Count {
    int value;

    synchronized void setValue(int value) {
        this.value = value;
    }
}

class A {

    Count c;

    A(Count c) {
        this.c = c;
    }

    synchronized void f() {
        System.out.println("F Name: " + Thread.currentThread().getName());
        this.c.setValue(100);
        try {
            Thread.sleep(10000);
        } catch(Exception ex) {
            // some error
        }
        System.out.println("F Done: " + Thread.currentThread().getName());
    }


    synchronized void f1() {
        System.out.println("F1 Name: " + Thread.currentThread().getName());
        this.c.setValue(200);
        try {
            Thread.sleep(10000);
        } catch(Exception ex) {
            // some error
        }
        System.out.println("F1 Done: " + Thread.currentThread().getName());
    }
}

public class ThreadTest {
    public static void main(String args[]) {
        Count c = new Count();
        A a1 = new A(c);
        A a2 = new A(c);

        new Thread(new Runnable(){
            public void run() {
                a1.f();
            }
        }).start();


        new Thread(new Runnable(){
            public void run() {
                a2.f1();
            }
        }).start();

    }
}