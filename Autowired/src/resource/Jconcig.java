package resource;

import java.util.ArrayList;
import java.util.List;

//import javax.security.auth.Subject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pojo.Address;
import pojo.Student;
import pojo.Subject;

@Configuration
public class Jconcig {

	@Bean
	public Address addrBeanObj() {
		Address add=new Address();
		add.setHouse_no("1213");
		add.setCity("rama");
		add.setPincode(999);
		
		return add;
		
	}
	@Bean
	public Subject subBeanObj() {
		Subject sub=new Subject();
		
		List<String> subjList=new ArrayList<String>();
		
/*	List<String > subjList=new ArrayList<String>();
		subjList.add("java "
				+ "python "
				+ "coreJava "
				+ "mathematics");
 
*/
	
		subjList.add("java");
		subjList.add("python");
		subjList.add("coreJava");
		subjList.add("mathematics");
		
		sub.setSubject(subjList);
		
		return sub;
		
	}
	@Bean
	public Student stdbeanObj() {
		Student std =new Student ();
		std.setName("ram");
		std.setRoll_no(342);
		std.setEmail_id("abc@gmail.com");
		/*
		 * here we are skipping the below line as autowired is configured in student class for address 
		 * as we want the dependency injection to be done automatically 
		 */
//		std.setAddress(addrBeanObj());
//		std.setSubject(subBeanObj());		
		return std;
		
	}
	
}
