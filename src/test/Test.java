package test;

public class Test
{

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
        int[] array1 = {4, 6, 7, 7, 7, 7, 8, 8, 9, 10, 100, 130, 130, 140, 150,160};
        int[] array2 = {2, 3, 4, 4, 4, 4, 7, 8, 8, 8, 8, 9, 100, 130, 150, 160};
        java.util.List<Integer> result = new java.util.LinkedList<Integer>();
        //  index��ʾarray2��������i��ʾarray1������
        int index = 0, i = 0;
        while(i < array2.length && index < array1.length)
        {
        	//  ����������鵱ǰֵ��ȣ��ҵ�һ������Ԫ��
        	if(array2[i] == array1[index])
        	{
        		result.add(array2[i]);
        		i++;
        	}
        	//  ���array2�ĵ�ǰԪ��С��array1�ĵ�ǰԪ�أ�����array2��Ԫ�ز������ǽ����е�Ԫ�أ�����i++
        	else if(array2[i] < array1[index])
        		i++;
        	else
        		index++;
        		
        }
        System.out.println(result);


	}

}
