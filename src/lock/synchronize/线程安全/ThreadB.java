package lock.synchronize.线程安全;

class ThreadB extends Thread {
	 
    private HasSelfPrivateNum numRef;
 
    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }
 
    @Override
    public void run() {
        super.run();
        numRef.addII("b");
    }
 
}
