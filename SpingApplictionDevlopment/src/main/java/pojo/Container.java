package pojo;

import java.io.IOException;
import java.util.Properties;

public class Container {
	public Object getContainer(String name) {
		
		
		try {
			Properties pro = new Properties();
			pro.load(Container.class.getClassLoader().getResourceAsStream("network.properties"));
			return Class.forName(pro.getProperty(name)).newInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
