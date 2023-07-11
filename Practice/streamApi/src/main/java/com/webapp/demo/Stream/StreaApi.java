package com.webapp.demo.Stream;

import java.util.Arrays;
import java.util.List;

public class StreaApi {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,45,67,43,49,67);
		//Function<Integer> fn = new Function();
		
				list.stream().sorted().filter(n -> n%2==1).map(n->n*2).forEach(n->System.out.println(n));
		

	}

}					
