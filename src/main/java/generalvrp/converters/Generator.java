package generalvrp.converters;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

import generalvrp.vo.InstanciaGeralVO;

public class Generator {

	InstanciaGeralVO instanciaGeral;

	public void recInstances() throws IOException {

		Gson gson = new Gson();

		String fileName = "./src/main/resources/data/testeSolomon.json";
		String json = String.join(" ", Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8));
		System.out.println(json);

		// Leitura do arquivo json e Transformação em Objeto.
		instanciaGeral = new Gson().fromJson(json, InstanciaGeralVO.class);

		String saidaInstanciaGeral = gson.toJson(instanciaGeral);
		System.out.println(saidaInstanciaGeral);

		// Escrita do arquivo no formato json
		// FileWriter arq = new
		// FileWriter("/home/felipelima/eclipse-workspace/tccfelipe/TCCFelipe/src/main/resources/data/solomon/SolomonInstanceRC105.json");
		FileWriter arq = new FileWriter("./src/main/resources/data/testeEscritaSolomon.json");

		arq.write(saidaInstanciaGeral);
		arq.close();
	}
}
