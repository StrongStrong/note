package lock.synchronize.多个对象多个锁;

class ThreadB extends Thread {
	 
    private HasSelfPrivateNum numRef;
 
    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }
 
    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
 
}
