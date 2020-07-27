package generalvrp.load;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

import generalvrp.vo.GeneralInstanceVO;

public class LoadInstance {

	GeneralInstanceVO generalInstance;

	public void recInstances(String fileName) throws IOException {

		String json = String.join(" ", Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8));

		// Leitura do arquivo json e Transformação em Objeto.
		Gson gson = new Gson();
		generalInstance = new Gson().fromJson(json, GeneralInstanceVO.class);
		String saidaInstanciaGeral = gson.toJson(generalInstance);
		System.out.println(saidaInstanciaGeral);

	}
}
