package sample02;

public class HelloSpring {

	public static void main(String[] args) {
		MessageBean messageBean; 
		
		messageBean = new MessageBeanEn(); //결합도 낮추기, 부모 = 자식
		messageBean.sayHello("Spring");
		
		System.out.println();
		
		messageBean = new MessageBeanKo();
		messageBean.sayHello("스프링");
		
		
	}

}
