package sort;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sourceArray= {12,235,45,56,85,945,32,4,6};
		
		try {
			int[] arr=sort(sourceArray);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	public static int[] sort(int[] sourceArray) throws Exception {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        // �ܹ�Ҫ���� N-1 �ֱȽ�
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            // ÿ����Ҫ�ȽϵĴ��� N-i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[min]) {
                    // ��¼Ŀǰ���ҵ�����СֵԪ�ص��±�
                    min = j;
                }
            }

            // ���ҵ�����Сֵ��iλ�����ڵ�ֵ���н���
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }

        }
        return arr;
    }
	

}
