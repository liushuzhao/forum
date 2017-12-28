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
        //  index表示array2的索引，i表示array1的索引
        int index = 0, i = 0;
        while(i < array2.length && index < array1.length)
        {
        	//  如果两个数组当前值相等，找到一个交集元素
        	if(array2[i] == array1[index])
        	{
        		result.add(array2[i]);
        		i++;
        	}
        	//  如果array2的当前元素小于array1的当前元素，表明array2的元素不可能是交集中的元素，所以i++
        	else if(array2[i] < array1[index])
        		i++;
        	else
        		index++;
        		
        }
        System.out.println(result);


	}

}
