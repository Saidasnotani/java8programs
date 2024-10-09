package java8programspractice;


import java.util.List;
import java.util.ArrayList;

public class java8testermethodreferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		      List names = new ArrayList();
				
		      names.add("Mahesh");
		      names.add("Suresh");
		      names.add("Ramesh");
		      names.add("Naresh");
		      names.add("Kalpesh");
				
		     names.forEach(System.out::println);
		    names.remove("Suresh");
		      names.forEach(a->System.out.println(a));
		      
		   }

}
