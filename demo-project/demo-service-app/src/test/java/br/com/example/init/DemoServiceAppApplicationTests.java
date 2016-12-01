package br.com.example.init;

import br.com.example.impl.mapper.ClienteMapper;
import br.com.example.impl.model.ClienteModel;
import br.com.example.impl.service.ClienteService;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = Application.class)
public class DemoServiceAppApplicationTests {

	private ClienteService clienteService;
	private ClienteMapper clienteMapper;

	@Before
	public void setUp() throws Exception{
		clienteMapper = mock(ClienteMapper.class);
		clienteService = new ClienteService(clienteMapper);
	}

	@Test
	public void getAllClientes() throws Exception {
		when(clienteMapper.findAllClientes()).thenReturn(Arrays.asList(new ClienteModel(), new ClienteModel()));
		List<ClienteModel> allClientes = clienteService.findAllClientes();
		System.out.println(allClientes);
		assertThat(allClientes.size(), is(2));
	}
}
