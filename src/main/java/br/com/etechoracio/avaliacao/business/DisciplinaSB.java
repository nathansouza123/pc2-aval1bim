package br.com.etechoracio.avaliacao.business;

import br.com.etechoracio.avaliacao.dao.DisciplinaDAO;
import br.com.etechoracio.common.business.BaseSB;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisciplinaSB extends BaseSB {
	
	
	private DisciplinaDAO disciplinaDAO;
	
	
	



	@Override
	protected void postConstructImpl() {
		disciplinaDAO = getDAO(DisciplinaDAO.class);

	}
	
}
