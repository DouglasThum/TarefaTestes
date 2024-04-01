package dao.mock;

import dao.IContratoDao;
import domain.Contrato;

public class ContratoDaoMock implements IContratoDao {

	@Override
	public void salvar() {
	}

	@Override
	public Contrato buscar(Contrato contrato) {
		return contrato;
	}
	
	@Override
	public void excluir() {
	}

	@Override
	public void atualizar() {		
	}
}
