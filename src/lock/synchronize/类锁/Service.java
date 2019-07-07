package lock.synchronize.����;

class Service {

	public static void printA() {
		try {
			synchronized (Service.class) {
				System.out.println(
						"�߳�����Ϊ��" + Thread.currentThread().getName() + "��" + System.currentTimeMillis() + "����printA");
				Thread.sleep(3000);
				System.out.println(
						"�߳�����Ϊ��" + Thread.currentThread().getName() + "��" + System.currentTimeMillis() + "�뿪printA");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public static void printB() {
		synchronized (Service.class) {
			System.out.println(
					"�߳�����Ϊ��" + Thread.currentThread().getName() + "��" + System.currentTimeMillis() + "����printB");
			System.out.println(
					"�߳�����Ϊ��" + Thread.currentThread().getName() + "��" + System.currentTimeMillis() + "�뿪printB");
		}
	}

}
