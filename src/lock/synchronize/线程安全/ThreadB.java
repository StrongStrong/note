package lock.synchronize.�̰߳�ȫ;

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
