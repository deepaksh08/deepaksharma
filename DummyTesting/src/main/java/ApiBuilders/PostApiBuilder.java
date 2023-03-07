package ApiBuilders;

import java.util.HashMap;
import java.util.Map;

public class PostApiBuilder {

	
	public String  postRequestBody(){
		Map<String, String> body = new HashMap<String, String>();
		body.put("name", "Deepak");
		body.put("job", "Tester");
				
		
		return body.toString();
	}	
	
		
	public static void main(String[] args) {
		PostApiBuilder post = new PostApiBuilder();
		
		System.out.println(post.postRequestBody());
		
		    
		             
		
		
		
	}
	
	}
