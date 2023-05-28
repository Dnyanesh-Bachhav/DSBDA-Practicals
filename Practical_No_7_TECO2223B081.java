/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String data = "A paragraph is a series of sentences that are paragraph and coherent, and are all related to paragraph single topic. Almost every piece of writing you do that is longer than paragraph to paragraph sentences should be organized into paragraphs.";
		String arr[] = data.split(" ");
		System.out.println("Length of paragraph: "+arr.length);
		Map<String, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
		    if(!map.containsKey(arr[i]))
		    {
		       map.put(arr[i],1); 
		    }
		    else{
		        map.put(arr[i], map.get(arr[i])+1);
		    }
		}
		System.out.println("\n\nFrequency count in java:");
		for (Map.Entry<String,Integer> entry : map.entrySet()) 
            System.out.println(entry.getKey() +
                             " = " + entry.getValue());
	}
}
