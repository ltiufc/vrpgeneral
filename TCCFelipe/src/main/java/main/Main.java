package main;

import com.google.gson.Gson;

import model.DC;
import model.Params;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DC dc = new DC(1,-39.222,-7.2999);
		Params params = new Params();
		
		params.setClientCode(123);
		params.setDc(dc);
		params.setLoadVelocity(2000);
		params.setMapCode(345);
		
		Gson gson = new Gson();
		String saida = gson.toJson(params);
		
		System.out.println(saida);

	}

}
