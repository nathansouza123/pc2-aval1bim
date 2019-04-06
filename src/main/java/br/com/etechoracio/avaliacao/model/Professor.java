package br.com.etechoracio.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_PROFESSOR")


public class Professor extends BaseORM  {
	
	
	@Id
	@GeneratedValue
	@Column(name="ID_PROFESSOR")
	private long id;
	
	@Column(name="NR_MATRICULA")
	private long matricula;
	
	@Column(name="TX_NOME")
	private String nome;

}
