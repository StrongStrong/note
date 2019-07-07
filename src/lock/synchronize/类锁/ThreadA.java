package lock.synchronize.ÀàËø;

class ThreadA extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
 
}