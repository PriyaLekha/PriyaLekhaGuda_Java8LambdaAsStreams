//Write a method to find average of given list of numbers

package epam;

import java.util.*;
public class FindAverageUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		list.add(40);
		System.out.println("Average of given list : "+average(list));
	}
	static Double average(List<Integer> list)
	{
		return list.stream().mapToDouble(i -> (double)i).average().getAsDouble();
	}
}

/*
OUTPUT:
 Average of given list : 27.5
*/