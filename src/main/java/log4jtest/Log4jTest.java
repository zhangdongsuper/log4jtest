package log4jtest;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Log4jTest {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(Log4jTest.class);
	
	
	public static void main(String[] args)
	{
			logger.debug("main(String[]) - start");
		
		//去重复数值+数值大于4+升序排列后只返回前3个元素
		List<Integer> list = Arrays.asList(1,2,3,3,3,4,0,-11,5,6,7,8,9);
		
//		List<Integer> list1 = details(list);
		List<Object> list1 = supperDetails(list);
		for (Object num : list1) {
			System.out.println(num);
		}
		
			logger.debug("main(String[]) - end");
	}


	/**
	 * 去重复数值+数值大于4+升序排列后只返回前3个元素
	 * @param list
	 * @return
	 */
	private static List<Integer> details(List<Integer> list) {
		Collections.sort(list);
//		Collections.reverse(list);
		List<Integer> list1 = new LinkedList<Integer>();
		
		Iterator<Integer> iterator = list.iterator();
		int count = 0;
		while(iterator.hasNext()){
			Integer next = iterator.next();
			
			if(next>4){
				if(!list1.contains(next)){
					list1.add(next);
					count++;
					if(count == 3){
						break;
					}
				}
			}
		}
		return list1;
	}
	
	
	private static List<Object> supperDetails(List list){
//		Stream limit = list.stream().distinct().filter().sorted().limit(3);
		
//		return Arrays.asList(limit.toArray());
		return null;
	}
	
}
