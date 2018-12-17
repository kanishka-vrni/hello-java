class Thread2 {
  public static void main(String args[]) {
    System.out.println(Thread.currentThread() + " starts");
    MyRunnable m1 = new MyRunnable();
    System.out.println(Thread.currentThread() + " ends");
  }
}

class MyRunnable implements Runnable {
  MyRunnable() {
    new Thread(this).start();
  }

  public void run() {
    System.out.println(Thread.currentThread() + "MyRunnable starts");
    for (int i=1; i<=5; i++) {
      System.out.println(Thread.currentThread() + "MyRunnable sleeping");
      try {
        Thread.sleep(i*100);
      } catch(InterruptedException ex) {
        System.out.println(Thread.currentThread() + " Interrupted");
      }
    }
    System.out.println(Thread.currentThread() + "MyRunnable ends");
  }
}
