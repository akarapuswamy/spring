package pojo1;

public class GreetingMsg {
	
	private int id;
	private String name;
	
	
	




		public GreetingMsg(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

//	public int getId() {
//		return id;
//	}



	public void setId(int id) {
		this.id = id;
	}



//	public String getName() {
//		return name;
//	}



	public GreetingMsg() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void setName(String name) {
		this.name = name;
	}



	public void msg() {
		System.out.println(id+" "+name+"welcome to string frameWork");
	}
	

}
