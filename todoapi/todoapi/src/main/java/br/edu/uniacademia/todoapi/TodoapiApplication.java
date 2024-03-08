package br.edu.uniacademia.todoapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.uniacademia.todoapi.model.Administrador;
import br.edu.uniacademia.todoapi.model.Etipo;

@SpringBootApplication
public class TodoapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TodoapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!");
		var adm = new Administrador("Victor", "victor.men", "124");
		adm.setTipoAdmin(Etipo.AdminGroup);
		System.out.println(adm.getNome() + " - " + adm.getTipoAdmin() + "" + adm.getLogin() + "" + adm.getSenha());
	}

}
