package lock.lock.lockInterruptibly����;
class MyThread extends Thread {
    private Lock_lockInterruptibly test = null;
    public MyThread(Lock_lockInterruptibly test) {
        this.test = test;
    }
    @Override
    public void run() {
         
        try {
            test.insert(Thread.currentThread());
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"���ж�");
        }
    }
}
