package lock.synchronize.��this��;

class ThreadB extends Thread {
    private Service service;
 
    public ThreadB(Service service) {
        super();
        this.service = service;
    }
 
    @Override
    public void run() {
        service.setUsernamePassword("b", "bb");
 
    }
 
}