package InnerClass.NonStatic;

 class House{
	 int roomNo;
	 public void display() {
		 System.out.println(this.roomNo);
	 }
	static class Room{
		  int height;
		  int width;
		  public void show() {
			  System.out.println(height+","+width);
		  }
	 }
}
public class NonStaticInnerDemo {
public static void main(String [] args) {
	House h=new House();
	h.roomNo=23;
	h.display();
//	House.Room r=h.new Room();
	House.Room r=new House.Room();
	r.height=123;
	r.width=132;
	r.show();
}
}
