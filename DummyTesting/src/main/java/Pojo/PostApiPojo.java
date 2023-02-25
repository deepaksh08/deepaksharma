package Pojo;

import java.io.Serializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PostApiPojo {

	private String name;
	private String job;

	public PostApiPojo(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {

		return "PostApiPojo [name=" + this.name + ", job=" + this.job + "]";
	}

	public static Serializable getpojooutput(PostApiPojo p) throws JsonProcessingException {
		String payload = new ObjectMapper().writeValueAsString(p);

		return payload;
	}

	public static void main(String[] args) throws JsonProcessingException {

		PostApiPojo pojo = new PostApiPojo("deepak", "sharma");

		System.out.println(pojo.getpojooutput(pojo));

	}
}
