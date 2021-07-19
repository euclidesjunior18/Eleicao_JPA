package br.edu.unoesc.java.eleicao.ui;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.unoesc.java.eleicao.model.Partido;
import br.edu.unoesc.java.eleicao.model.repository.PartidoRepository;

@SpringBootApplication
public class EleicaoApp implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(EleicaoApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// aqui eu escrevo a minha logica 
		
		PartidoRepository partidoRepository = new PartidoRepository();
		Partido p = new Partido();
		p.setNome("Partido do brasil");
        p.setSigla("PB");
        
        partidoRepository.save();
	}
}


