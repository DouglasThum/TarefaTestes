package service;

import domain.Contrato;

public interface IContratoService {
	
	public String salvar();

	public Contrato buscar(Contrato contrato);
	
	public String excluir();
	
	public String atualizar();
}
