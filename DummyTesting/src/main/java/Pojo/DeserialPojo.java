package Pojo;

public class DeserialPojo {
	
	
	private DataPojo data;
	private SupportPojo support;
	
	public DataPojo getData() {
		return data;
	}
	public void setData(DataPojo data) {
		this.data = data;
	}
	public SupportPojo getSupport() {
		return support;
	}
	public void setSupport(SupportPojo support) {
		this.support = support;
	}
	@Override
	public String toString() {
		return "DeserialistationPojo [data=" + data + ", support=" + support + "]";
	}
	
	
	

}
