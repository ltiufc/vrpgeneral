package generalvrp.load;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LoadInstance loadInstance = new LoadInstance();
		
		loadInstance.recInstances("target/classes/data/solomon/SolomonInstanceC101.json");
		
		
	}

}
