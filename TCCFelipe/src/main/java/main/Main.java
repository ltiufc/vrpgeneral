package main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import model.DC;
import model.InstanciaGeral;
import model.Params;

public class Main {

	public static void main(String[] args) throws IOException {
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
		
		String fileName = "/home/felipelima/eclipse-workspace/tccfelipe/exemploFormatoGeral.json";
		String json = String.join(" ", Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8));
		
		InstanciaGeral instanciaGeral = new Gson().fromJson(json, InstanciaGeral.class);
		
		String saidaInstanciaGeral = gson.toJson(instanciaGeral);
		System.out.println(saidaInstanciaGeral);
	}

}
