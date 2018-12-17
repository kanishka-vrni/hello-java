class Thread1 {
  public static void main(String args[]) {
    System.out.println(Thread.currentThread() + " starts");
    MyThread m1 = new MyThread();
    m1.start();
    System.out.println(Thread.currentThread() + " ends");
  }
}

class MyThread extends Thread {
  MyThread() {
  }

  public void run() {
    System.out.println(Thread.currentThread() + "MyThread starts");
    for (int i=0; i<5; i++) {
      System.out.println(Thread.currentThread() + "MyThread sleeping");
      try {
        Thread.sleep(100);
      } catch(InterruptedException ex) {
        System.out.println(Thread.currentThread() + " Interrupted");
      }
    }
    System.out.println(Thread.currentThread() + "MyThread ends");
  }
}
