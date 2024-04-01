package testes;

import org.junit.Assert;
import org.junit.Test;

import dao.ContratoDao;
import dao.IContratoDao;
import dao.mock.ContratoDaoMock;
import domain.Contrato;
import service.ContratoService;
import service.IContratoService;

public class ContratoServiceTest {

	@Test
	public void salvarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Salvo", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroSalvarTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Salvo", retorno);
	}
	
	@Test
	public void buscarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		Contrato contrato = new Contrato("123");
		Contrato retorno = service.buscar(contrato);
		Assert.assertEquals("123", retorno.getNumContrato());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroBuscarTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		Contrato contrato = new Contrato("123");
		Contrato retorno = service.buscar(contrato);
		Assert.assertEquals("123", retorno.getNumContrato());
	}
	
	@Test
	public void excluirTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir();
		Assert.assertEquals("Excluido", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroExcluirTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir();
		Assert.assertEquals("Excluido", retorno);
	}
	
	@Test
	public void atualizarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.atualizar();
		Assert.assertEquals("Atualizado", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroAtualizarTest() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.atualizar();
		Assert.assertEquals("Atualizado", retorno);
	}
}
