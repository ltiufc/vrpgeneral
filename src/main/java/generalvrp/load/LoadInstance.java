package generalvrp.load;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

import entity.GeneralInstance;
import generalvrp.vo.GeneralInstanceVO;

public class LoadInstance {

	GeneralInstanceVO generalInstance;

	public GeneralInstance recInstances(String fileName) throws IOException {

		String json = String.join(" ", Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8));

		//AbstractRealDistribution  x = new NormalDistribution(0, 1);
		
		// Leitura do arquivo json e Transformação em Objeto.
		Gson gson = new Gson();
		generalInstance = new Gson().fromJson(json, GeneralInstanceVO.class);
		String saidaInstanciaGeral = gson.toJson(generalInstance);
		System.out.println(saidaInstanciaGeral);
		
		return convertVoToEntity(generalInstance);

	}

	private GeneralInstance convertVoToEntity(GeneralInstanceVO generalInstance2) {
		// TODO Auto-generated method stub
		return null;
	}
}
