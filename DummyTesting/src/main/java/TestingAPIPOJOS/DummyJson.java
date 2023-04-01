package TestingAPIPOJOS;

public class DummyJson {

	
	
	String jsonforprocessing = "{\r\n"
			+ "  \"headOfficeBranch\" : \"Shyam\",\r\n"
			+ "  \"headOfficeLocation\" : \"Khatu\",\r\n"
			+ "  \"noOfEmployees\" : 1100,\r\n"
			+ "  \"supportedBanks\" : [ \"ICICI\", \"HDFC\", \"SBI\" ],\r\n"
			+ "  \"employee\" : [ {\r\n"
			+ "    \"firstName\" : \"deepak\",\r\n"
			+ "    \"lastName\" : \"sharma\",\r\n"
			+ "    \"job\" : \"testing\",\r\n"
			+ "    \"age\" : 30,\r\n"
			+ "    \"married\" : false,\r\n"
			+ "    \"address\" : \"Delhi\"\r\n"
			+ "  }, {\r\n"
			+ "    \"firstName\" : \"rani\",\r\n"
			+ "    \"lastName\" : \"sharma\",\r\n"
			+ "    \"job\" : \"developer\",\r\n"
			+ "    \"age\" : 30,\r\n"
			+ "    \"married\" : false,\r\n"
			+ "    \"address\" : \"Chandigarh\"\r\n"
			+ "  }, {\r\n"
			+ "    \"firstName\" : \"Jai\",\r\n"
			+ "    \"lastName\" : \"sharma\",\r\n"
			+ "    \"job\" : \"head\",\r\n"
			+ "    \"age\" : 40,\r\n"
			+ "    \"married\" : true,\r\n"
			+ "    \"address\" : \"Delhi\"\r\n"
			+ "  } ],\r\n"
			+ "  \"employer\" : [ {\r\n"
			+ "    \"companyName\" : \"ABC infotect\",\r\n"
			+ "    \"companyAddress\" : \"Gurugram\",\r\n"
			+ "    \"companyPAN\" : \"BDDFH99003S\"\r\n"
			+ "  }, {\r\n"
			+ "    \"companyName\" : \"XYZ infotect\",\r\n"
			+ "    \"companyAddress\" : \"DELHI\",\r\n"
			+ "    \"companyPAN\" : \"BDDFH99003T\"\r\n"
			+ "  } ]\r\n"
			+ "}\r\n"
			+ "";
	
	public String getJson() {
		
		return jsonforprocessing;
	}
	
	
	
	
	public static void main(String[] args) {
		
		DummyJson obj = new DummyJson();
		System.out.println(obj.getJson());
		
		
	
		
	}
			
	
}
