package main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import model.InstanciaGeral;

public class Generator {

	InstanciaGeral instanciaGeral;

	public void recInstances() throws IOException {

		// Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
		// Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();

		/*Gson gson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new JsonDeserializer<LocalDateTime>() {
			@Override
			public LocalDateTime deserialize(JsonElement json, java.lang.reflect.Type typeOfT,
					JsonDeserializationContext context) throws JsonParseException {
				Instant instant = Instant.ofEpochMilli(json.getAsJsonPrimitive().getAsLong());
				return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
			}
		}).create();*/
		GsonBuilder gsonBuilder = new GsonBuilder();

		gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerializer());

		gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeDeserializer());

		Gson gson = gsonBuilder.setPrettyPrinting().create();
		
		// Gson gson = new Gson();
		String fileName = "/home/felipelima/Documentos/Faculdade/TCC/Instâncias/testeSolomon.json";
		String json = String.join(" ", Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8));
		System.out.println(json);

		// Leitura do arquivo json e Transformação em Objeto.
		instanciaGeral = new Gson().fromJson(json, InstanciaGeral.class);

		String saidaInstanciaGeral = gson.toJson(instanciaGeral);
		System.out.println(saidaInstanciaGeral);

		// Escrita do arquivo no formato json
		// FileWriter arq = new
		// FileWriter("/home/felipelima/eclipse-workspace/tccfelipe/TCCFelipe/src/main/resources/data/solomon/SolomonInstanceRC105.json");
		FileWriter arq = new FileWriter(
				"/home/felipelima/Documentos/Faculdade/TCC/Instâncias/testeEscritaSolomon.json");

		arq.write(saidaInstanciaGeral);
		arq.close();
	}

	class LocalDateTimeDeserializer implements JsonDeserializer<LocalDateTime> {
		@Override
		public LocalDateTime deserialize(JsonElement json, java.lang.reflect.Type typeOfT,
				JsonDeserializationContext context) throws JsonParseException {
			return LocalDateTime.parse(json.getAsString(),
					DateTimeFormatter.ofPattern("dd::MMM::uuuu HH::mm::ss").withLocale(Locale.ENGLISH));
		}
	}

	class LocalDateTimeSerializer implements JsonSerializer<LocalDateTime> {
		private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd::MMM::uuuu HH::mm::ss");

		@Override
		public JsonElement serialize(LocalDateTime src, java.lang.reflect.Type typeOfSrc,
				JsonSerializationContext context) {
			// TODO Auto-generated method stub
			return new JsonPrimitive(formatter.format(src));
		}
	}
}
