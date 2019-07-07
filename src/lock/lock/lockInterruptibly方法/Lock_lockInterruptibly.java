package lock.lock.lockInterruptibly����;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock_lockInterruptibly {
	private Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		Lock_lockInterruptibly test = new Lock_lockInterruptibly();
		MyThread thread1 = new MyThread(test);
		MyThread thread2 = new MyThread(test);
		thread1.start();
		thread2.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread2.interrupt();
	}

	public void insert(Thread thread) throws InterruptedException {
		lock.lockInterruptibly(); // ע�⣬�����Ҫ��ȷ�жϵȴ������̣߳����뽫��ȡ���������棬Ȼ��InterruptedException�׳�
		try {
			System.out.println(thread.getName() + "�õ�����");
			long startTime = System.currentTimeMillis();
			for (; ; ) {
				if (System.currentTimeMillis() - startTime >= Integer.MAX_VALUE)
					break;
				// ��������
			}
		} finally {
			System.out.println(Thread.currentThread().getName() + "ִ��finally");
			lock.unlock();
			System.out.println(thread.getName() + "�ͷ�����");
		}
	}

}
