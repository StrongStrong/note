package lock.lock.trylock����;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock_trylock2 {
	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private Lock lock = new ReentrantLock();    //ע������ط�
    public static void main(String[] args)  {
        final Lock_trylock2 test = new Lock_trylock2();
         
        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();
         
        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();
    }  
     
    public void insert(Thread thread) {
    	try {
			if(lock.tryLock(2000,TimeUnit.MILLISECONDS)) {
			    try {
			        System.out.println(thread.getName()+"�õ�����");
			        for(int i=0;i<5;i++) {
			            arrayList.add(i);
			        }
			        Thread.sleep(1500);
			    } catch (Exception e) {
			        // TODO: handle exception
			    }finally {
			        System.out.println(thread.getName()+"�ͷ�����");
			        lock.unlock();
			    }
			} else {
			    System.out.println(thread.getName()+"��ȡ��ʧ��");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
