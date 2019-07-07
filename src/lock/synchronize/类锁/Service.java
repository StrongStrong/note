package lock.synchronize.类锁;

class Service {

	public static void printA() {
		try {
			synchronized (Service.class) {
				System.out.println(
						"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printA");
				Thread.sleep(3000);
				System.out.println(
						"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printA");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public static void printB() {
		synchronized (Service.class) {
			System.out.println(
					"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printB");
			System.out.println(
					"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printB");
		}
	}

}
