package test;

import java.util.List;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;

import com.topview.www.demo.HelloWorldService;
import com.topview.www.demo.impl.HelloWorldImpl;
import com.topview.www.demo.impl.MyRole;
import com.topview.www.demo.impl.MyRoleArray;
import com.topview.www.demo.impl.Role;
import com.topview.www.interceptor.AddHeaderInterceptor;

public class Client {
	
	
	
	
	 public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		HelloWorldService service = new HelloWorldService();
		HelloWorldImpl helloWorld = service.getHelloWorldPort();
		org.apache.cxf.endpoint.Client client = ClientProxy.getClient(helloWorld);
		client.getOutInterceptors().add(new AddHeaderInterceptor("java","123456"));
		client.getInInterceptors().add(new LoggingInInterceptor());
		client.getOutInterceptors().add(new LoggingInInterceptor());
		//System.out.println(helloWorld.say("huangjunjie"));
//		User user = new User();
//		user.setPassword("123456");
//		user.setUserName("java1234");
//		List<Role> roleList = helloWorld.getRoleByUser(user);
		Role role = null;
//		for(int i=0;i<roleList.size();i++) {
//			role = roleList.get(i);
//			System.out.println(role.getRoleName());
//		}
		
		MyRoleArray roleListMap = helloWorld.getRole();
		List<MyRole> roleList = roleListMap.getItem();
		for(int i=0;i<roleList.size();i++) {
			MyRole my = roleList.get(i);
			System.out.println(my.getKey()+":");
			for(Role r:my.getValue()) {
				System.out.println(r.getId()+","+r.getRoleName());
			}
		}
		 
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"client-beans.xml"});
//		HelloWorldImpl helloWorldImpl = (HelloWorldImpl)context.getBean("hello");
//		System.out.println("----------------");
//		User user = new User();
//		user.setPassword("123456");
//		user.setUserName("java1234");
//		List<Role> roleList = helloWorldImpl.getRoleByUser(user);
//		Role role = null;
//		for(int i=0;i<roleList.size();i++) {
//			role = roleList.get(i);
//			System.out.println(role.getRoleName());
//		}
		
//		helloWorldImpl.say("helloWorld");
	}
}
