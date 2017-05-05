package br.com.example.init;

import br.com.example.impl.mapper.ClienteMapper;
import br.com.example.impl.model.ClienteModel;
import br.com.example.impl.service.ClienteService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by william on 05/05/2017.
 */
public class ClienteTest {

    @Mock
    private ClienteMapper clienteMapper;
    @Mock
    private ClienteModel clienteModel;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findCliente(){
        List<ClienteModel> clienteModels = new ArrayList<>(Arrays.asList(new ClienteModel(), new ClienteModel(), new ClienteModel()));
        doReturn(clienteModels)
                .when(clienteMapper).findByName(anyString());
        assertThat(clienteModels.size(), is(3));
    }

    @Test
    public void findForId(){
        ClienteService clienteService = mock(ClienteService.class);
        clienteModel.setId(12L);
        when(clienteMapper.findById(clienteModel.getId())).thenReturn(clienteModel);
        assertNotNull(clienteMapper.findById(clienteModel.getId()));
        when(clienteService.findById(clienteModel.getId())).thenCallRealMethod();
        assertEquals(clienteModel.getId(), clienteMapper.findById(clienteModel.getId()).getId());
    }

}
