import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		// Object Contruction 
		Employee eRef = new Employee();
		eRef.setEname("Tom Stewert");
		eRef.setEid(101);
		eRef.setEaddress("Austin Blv");
		
		System.out.println("Employee Details: " + eRef);

		// Spring Way | IOC (Inversion Of Control)
		// Add Jar Files
		
		Resource resource = new ClassPathResource("employeebean.xml");
		BeanFacotroy factory = new XmlBeanFactory(resource);
		
		Employee e1 = (Employee)factory.getBean("emp1");
		Employee 
		
		
	}

}
