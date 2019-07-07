package lock.synchronize.thisËø;

class ObjectService {
	 
    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("begin time=" + System.currentTimeMillis()+"thread name="+Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("end    end=" + System.currentTimeMillis()+"thread name="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}