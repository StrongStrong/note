package lock.synchronize.����;

class ThreadB extends Thread {
    @Override
    public void run() {
        Service.printB();
    }
 
}