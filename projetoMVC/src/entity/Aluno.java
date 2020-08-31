package entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aluno {
	private Integer idAluno;
	private String nome; //valida
	private String disciplina; //valida
	private Double nota1; //valida
	private Double nota2; //valida
	private Double media=0.;
	
	public Aluno() {
	
	}
	
	public Aluno(Integer idAluno, String nome, String disciplina, Double nota1, Double nota2, Double media) {
		super();
		this.idAluno = idAluno;
		this.nome = nome;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
	}

	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nome=" + nome + ", disciplina=" + disciplina + ", nota1=" + nota1
				+ ", nota2=" + nota2 + ", media=" + media + "]";
	}


	public Integer getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
	
	//validacao de campos
	
	public Boolean isNome() {
		Pattern p = Pattern.compile("[a-z A-Z]{2,50}");
		Matcher m = p.matcher(this.nome);
		return m.matches();
	}
	
	public Boolean isDisciplina() {
		Pattern p = Pattern.compile("java|angular|node|javascript");
		Matcher m = p.matcher(this.disciplina);
		return m.matches();
	}
	
	public Boolean isNota1() {
		if (this.nota1 >=0 & this.nota1<=10) {
			return true;
		}else {
			return false;
		}
	}
	
	public Boolean isNota2() {
		if (this.nota2 >=0 & this.nota2<=10) {
			return true;
		}else {
			return false;
		}
	}
}
