package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import model.InstanciaGeral;

public class Generator {

	InstanciaGeral instanciaGeral;

	public void recInstances() throws IOException {

		Gson gson = new Gson();
	
		String fileName = "/home/felipelima/Documentos/Faculdade/TCC/Instâncias/testeSolomon.json";
		String json = String.join(" ", Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8));
		//Leitura do arquivo json e Transformação em Objeto.
		instanciaGeral = new Gson().fromJson(json, InstanciaGeral.class);

		
		String saidaInstanciaGeral = gson.toJson(instanciaGeral);
		System.out.println(saidaInstanciaGeral);
		
		//Escrita do arquivo no formato json 
		FileWriter arq = new FileWriter("/home/felipelima/eclipse-workspace/tccfelipe/TCCFelipe/src/main/resources/data/solomon/SolomonInstanceC101.json");
		
		arq.write(saidaInstanciaGeral);
		arq.close();
	}
}
