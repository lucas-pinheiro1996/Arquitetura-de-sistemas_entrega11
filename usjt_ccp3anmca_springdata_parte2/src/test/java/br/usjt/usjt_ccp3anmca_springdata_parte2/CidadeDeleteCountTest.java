package br.usjt.usjt_ccp3anmca_springdata_parte2;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.usjt_ccp3anmca_springdata_parte2.model.repository.CidadeRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CidadeDeleteCountTest {
	@Autowired
	private CidadeRepository cidadeRepo;
	/*
	@Test
	@Order (0)
	public void deleteTest() {
		System.out.println("\n Delete: " + cidadeRepo.deleteByNome("Teste"));
	}
	
	@Test
	@Order (1)
	public void countTest() {
		System.out.println("\n Count: " + cidadeRepo.countByNome("São Caetano"));
	}
*/
}
