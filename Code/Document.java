package Code;

public class Document {
	String head;
	public Document(String head) {
		// TODO Auto-generated constructor stub
		this.head=head;
	}
	@Override
	public String toString(){
		return "大区 " + head + '\n' +
			   "Name      Price" + '\n'
			 + "无色小晶体: " + '\n'
			 + "白色小晶体: " + '\n';
	}
}
