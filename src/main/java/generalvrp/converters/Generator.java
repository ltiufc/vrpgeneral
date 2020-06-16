package generalvrp.converters;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

import generalvrp.vo.GeneralInstanceVO;

public class Generator {

	GeneralInstanceVO generalInstance;

	public void recInstances() throws IOException {

		Gson gson = new Gson();

		// String fileName = "./src/main/resources/data/testeSolomon.json";
		String fileName = "/home/felipelima/Documentos/Faculdade/TCC/Instâncias/Backup Instancias/base instancia de cordeau.json";

		String json = String.join(" ", Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8));
		System.out.println(json);

		// Leitura do arquivo json e Transformação em Objeto.
		generalInstance = new Gson().fromJson(json, GeneralInstanceVO.class);

		String saidaInstanciaGeral = gson.toJson(generalInstance);
		System.out.println(saidaInstanciaGeral);

		// Escrita do arquivo no formato json
		// FileWriter arq = new
		// FileWriter("/home/felipelima/eclipse-workspace/tccfelipe/TCCFelipe/src/main/resources/data/solomon/SolomonInstanceRC105.json");
		// FileWriter arq = new
		// FileWriter("./src/main/resources/data/testeEscritaSolomon.json");
		FileWriter arq = new FileWriter("/home/felipelima/Documentos/Faculdade/TCC/Instâncias/Backup Instancias/testeDia07.json");

		arq.write(saidaInstanciaGeral);
		arq.close();
	}
}
