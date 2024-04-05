package com.clases.clasesmanejogit;

import com.clases.clasesmanejogit.models.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ClasesManejogitApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(ClasesManejogitApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ClasesManejogitApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		FluxString();
		//FluxList();
	}

	private void FluxString(){
		Flux<String> name = Flux.just("Juan Valde", "Maria Rivera", "Luis Vento", "Mirian Rosa", "Mirian Maren");

		        name.map(usuario -> new Usuario(usuario.split(" ")[0].toLowerCase(), usuario.split(" ")[1].toLowerCase()))
				.filter(usuario -> usuario.getNombre().toLowerCase().equalsIgnoreCase("mirian"))
				.map(usu ->{
					String nombre = usu.getNombre();
					usu.setNombre(nombre);
					return usu;
				})
				.subscribe(sus -> log.info(sus.getNombre()));
	}

	private void FluxList(){
		List<String> usuarioList = new ArrayList<>();
		usuarioList.add("Juan Valde");
		usuarioList.add("Maria Rivera");
		usuarioList.add("Luis Vento");
		usuarioList.add("Mirian Rosa");
		usuarioList.add("Mirian Maren");

		Flux<String> name = Flux.fromIterable(usuarioList);

		//Flux<String> name = Flux.just("Juan Valde", "Maria Rivera", "Luis Vento", "Mirian Rosa", "Mirian Maren");

		Flux<Usuario> names = name.map(usuario -> new Usuario(usuario.split(" ")[0].toLowerCase(), usuario.split(" ")[1].toLowerCase()))
				.filter(usuario -> usuario.getNombre().toLowerCase().equalsIgnoreCase("mirian"))
				.map(usu ->{
					String nombre = usu.getNombre();
					usu.setNombre(nombre);
					return usu;
				});

		names.subscribe(sus -> log.info(sus.getNombre()), error -> log.error(error.getMessage()), new Runnable() {
			@Override
			public void run() {
				System.out.println("todo a terminado");
			}
		});
	}
}
