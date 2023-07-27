package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConverter {
	
	public static void main(String[] args) throws Exception{
		
		File f =new File("customer.json");
		
		//Converting json to java obj
		ObjectMapper mapper = new ObjectMapper();
		Customer c = mapper.readValue(f,Customer.class);
		System.out.println(c);
		
	}

}
