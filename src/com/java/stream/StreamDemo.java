package com.java.stream;

import java.util.Arrays;

public class StreamDemo {
public static void main(String[] args) {
	
	String st = "ajit welcome to java";
	
     Arrays.asList(st.split(" ")).stream().forEach(System.out::println);
     
}
}
