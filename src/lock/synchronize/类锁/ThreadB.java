package lock.synchronize.ÀàËø;

class ThreadB extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
 
}