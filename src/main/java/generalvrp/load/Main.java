package generalvrp.load;

import java.io.IOException;

import entity.GeneralInstance;
import generalvrp.vo.GeneralInstanceVO;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LoadInstance loadInstance = new LoadInstance();
		
		GeneralInstance generalInstance  = loadInstance.recInstances("target/classes/data/solomon/SolomonInstanceC101.json");

		System.out.println(generalInstance.toString());
	}

}
