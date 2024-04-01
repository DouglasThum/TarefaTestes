package service;

import dao.IContratoDao;
import domain.Contrato;

public class ContratoService implements IContratoService {
	
	private IContratoDao contratoDao;

	public ContratoService(IContratoDao contratoDao) {
		this.contratoDao = contratoDao;
	}

	@Override
	public String salvar() {
		contratoDao.salvar();
		return "Salvo";		
	}

	@Override
	public Contrato buscar(Contrato contrato) {
		contratoDao.buscar(contrato);
		return contrato;
	}

	@Override
	public String excluir() {
		contratoDao.excluir();
		return "Excluido";
	}

	@Override
	public String atualizar() {
		contratoDao.atualizar();
		return "Atualizado";
	}

}
