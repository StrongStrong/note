package lock.synchronize.��this��;

class Service {
	 
    String anyString = new String();
 
    public Service(String anyString){
        this.anyString = anyString;
    }
 
    public void setUsernamePassword(String username, String password) {
        try {
            synchronized (anyString) {
                System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
                        + "��" + System.currentTimeMillis() + "����ͬ����");
                Thread.sleep(3000);
                System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
                        + "��" + System.currentTimeMillis() + "�뿪ͬ����");
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 
}
