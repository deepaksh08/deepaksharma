package AppConfigs;

public   class ApiPath {

	
	public static final class apiPath{
	//GET
			public static final String GET_LIST_OF_USERS ="/api/users?page=2";
			public static final String GET_SINGLE_POST="/api/users/2";
			
			//POST
			public static final String CREATE_POST="/api/users";
			
			public static final String SINGLE_USER="/api/users/3";
			
	}	
	
public static void main(String[] args) {
	
	System.err.println(ApiPath.apiPath.GET_LIST_OF_USERS);
	
 

}
	

}


