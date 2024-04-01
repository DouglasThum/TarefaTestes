package testes;

import org.junit.Assert;
import org.junit.Test;

import dao.ClienteDao;
import dao.mock.ClienteDaoMock;
import service.ClienteService;

public class ClienteServiceTest {
	
	@Test
	public void salvarTest() {
		ClienteService service = new ClienteService(new ClienteDaoMock());
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void EsperadoErroSalvarTest() {
		ClienteService service = new ClienteService(new ClienteDao());
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
}
