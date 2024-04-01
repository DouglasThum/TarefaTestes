package dao;

import domain.Contrato;

public class ContratoDao implements IContratoDao {

	@Override
	public void salvar() {
		throw new UnsupportedOperationException("Necessário acesso ao banco");
	}

	@Override
	public Contrato buscar(Contrato contrato) {
		throw new UnsupportedOperationException("Necessário acesso ao banco");
	}

	@Override
	public void excluir() {
		throw new UnsupportedOperationException("Necessário acesso ao banco");
	}

	@Override
	public void atualizar() {
		throw new UnsupportedOperationException("Necessário acesso ao banco");
	}

}
