package lock.synchronize.����;

class ThreadA extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
 
}