package lock.synchronize.多个对象多个锁;

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
