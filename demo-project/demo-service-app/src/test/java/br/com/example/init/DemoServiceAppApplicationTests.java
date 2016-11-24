package br.com.example.init;

import br.com.example.impl.service.ClienteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DemoServiceAppApplicationTests {

	@Autowired
	private ClienteService clienteService;

	@Test
	public void getAllClientes() throws Exception {
		clienteService.findAllClientes().forEach(cliente -> System.out.println(cliente));
	}
}
