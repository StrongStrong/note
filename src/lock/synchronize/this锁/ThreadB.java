package lock.synchronize.thisËø;

class ThreadB extends Thread {
	 
    private ObjectService service;
 
    public ThreadB(ObjectService service) {
        super();
        this.service = service;
    }
 
    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
 
}
