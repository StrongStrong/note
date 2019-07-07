package lock.synchronize.线程安全;

class ThreadA extends Thread {
	 
    private HasSelfPrivateNum numRef;
 
    public ThreadA(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }
 
    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
 
}
