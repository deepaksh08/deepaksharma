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
		
		String outputJson = post.postRequestBody().replace(" ", "").replaceAll("([\\w]+):", "\"$1\":")
                .replaceAll(":([\\w|<|=]+)", ": \"$1\"")
                .replaceAll("\"([\\d]+)\"", "$1")
                .replace(":}", ": \"\"}")
                .replace(":]", ": \"\"]")
                .replace(":,", ": \"\",");        
		             
		
		System.out.println(outputJson);
		
	}
	
	}
