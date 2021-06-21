package model.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.enums.Sexo;

public class Aluno {
	private Integer matricula;
	private String nome;
	private Sexo sexo;
	private Date dataNascimento;
	private Integer id_turma;
	private Nota nota;
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
	public Aluno() {
	}

	public Aluno(Integer matricula, String nome, String sexo, String dataNascimento, Integer id_turma/*, Nota nota*/) throws ParseException {
		this.matricula = matricula;
		this.nome = nome;
		if(sexo.equals("Masculino"))
			this.sexo = Sexo.M;
		else
			this.sexo = Sexo.F;
		this.dataNascimento = sdf.parse(dataNascimento);
		this.id_turma = id_turma;
		//this.nota = nota;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		if(this.sexo.equals(Sexo.M))
			return "Masculino";
		return "Feminino";
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getId_turma() {
		return id_turma;
	}

	public void setId_turma(Integer id_turma) {
		this.id_turma = id_turma;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}
	
	public void infoAluno() {
		System.out.println("Matrícula: " + this.getMatricula());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Data de nascimento: " + sdf.format(this.getDataNascimento()));
	}
}
