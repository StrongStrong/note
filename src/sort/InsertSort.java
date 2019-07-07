package sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sourceArray = { 12, 235, 45, 56, 85, 945, 32, 4, 6 };

		try {
			int[] arr = sort(sourceArray);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int[] sort(int[] sourceArray) throws Exception {
		// �� arr ���п��������ı��������
		int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

		// ���±�Ϊ1��Ԫ�ؿ�ʼѡ����ʵ�λ�ò��룬��Ϊ�±�Ϊ0��ֻ��һ��Ԫ�أ�Ĭ���������
		for (int i = 1; i < arr.length; i++) {

			// ��¼Ҫ���������
			int tmp = arr[i];

			// ���Ѿ�������������ұߵĿ�ʼ�Ƚϣ��ҵ�����С����
			int j = i;
			while (j > 0 && tmp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}

			// ���ڱ���С����������
			if (j != i) {
				arr[j] = tmp;
			}

		}
		return arr;
	}

}
