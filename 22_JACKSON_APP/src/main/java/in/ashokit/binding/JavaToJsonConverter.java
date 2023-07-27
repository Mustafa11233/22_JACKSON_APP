package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {
	
	public static void main(String[] args) throws Exception {
		
		
		Address addr =new Address();
		addr.setCity("Warangal");
		addr.setState("Telangana");
		addr.setCountry("India");
		
		 Customer c =new Customer();
		 c.setId(1);
		 c.setName("Raju");
		 c.setPhno(12345l);
		 c.setEmail("raju@gmail.com");
		 c.setAddr(addr);
		 
		 //Converting java obj to json
		 ObjectMapper mapper = new ObjectMapper();
		 mapper.writeValue(new File("customer.json"), c);
		 System.out.println("Json file created");
		
	}

}
