package lock.synchronize.·ÇthisËø;

public class Run {
	 
    public static void main(String[] args) {
 
        Service service = new Service("rainbow");
 
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
 
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
 
    }
 
}
