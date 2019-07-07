package lock.lock.ReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class Queue3 {
    //�������ݣ�ֻ����һ���߳� д���ݣ������� ����̶߳�����
    private Object data = null;
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public void get() {
        rwl.readLock().lock();//�϶����������߳�ֻ�ܶ���
        System.out.println(Thread.currentThread().getName() +
                "׼���ö�ȡ data��");
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() +
                    "�Ѿ�������data  "+data);
            rwl.readLock().unlock();//�ͷŶ�������÷���finally����
        }
    }

    public void put(Object data) {
        rwl.writeLock().lock();//����д���������������߳� ��д
        System.out.println(Thread.currentThread().getName() +
                "׼����д data!!");
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.data=data;
            System.out.println(Thread.currentThread().getName() +
                    "�Ѿ�д���� data���� "+data);
            rwl.writeLock().unlock();//�ͷ���
        }
    }
}
