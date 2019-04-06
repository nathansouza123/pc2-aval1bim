package br.com.etechoracio.avaliacao.view;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.DualListModel;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.avaliacao.business.DisciplinaSB;
import br.com.etechoracio.avaliacao.business.ProfessorSB;
import br.com.etechoracio.avaliacao.model.Disciplina;
import br.com.etechoracio.avaliacao.model.Professor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
@Scope("view")
public class DisciplinaMB extends BaseMB {

	private ProfessorSB professorSB;
	private DisciplinaSB disciplinaSB;
	private Disciplina edit;
	private DualListModel<Professor> professores;

	public void postConstruct() {
		List<Professor> Source = professorSB.findAll();
		professores = new DualListModel<Professor>(Source, new ArrayList<Professor>());
	}

	public void onSave() {
		edit.setProfessores(professores.getTarget());
	}

}
