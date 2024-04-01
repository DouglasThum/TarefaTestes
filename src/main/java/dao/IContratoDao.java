package dao;

import domain.Contrato;

public interface IContratoDao {

	void salvar();
	
	Contrato buscar(Contrato contrato);
	
	void excluir();
	
	void atualizar();
}
