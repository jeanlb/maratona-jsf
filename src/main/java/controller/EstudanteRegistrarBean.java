package controller;

import java.io.Serializable;

import javax.inject.Named;

@Named(value = "estudante") // anotacao que declara que esta classe eh um bean gerenciado pelo CDI
public class EstudanteRegistrarBean implements Serializable {

	private static final long serialVersionUID = -7849870770778167393L;
	
	private String nome;
	private String sobrenome;
	private Double nota1;
	private Double nota2;
	
	// atribuicao a um tipo primitivo na declaracao do atributo nao da nullpointer na view
	private double nota3 = 10.0;
	
	public EstudanteRegistrarBean() {
		nome = "Jean Louis Brasil";
		sobrenome = "Fernandes da Costa";
		nota1 = 10.0;
		nota2 = 10.0;
		
		/* ao atribuir valor a um atributo de tipo primitivo no construtor e nao na declaracao do atributo,
		 * ocorre nullpointer na view. para testar remover a atribuicao de valor na declaracao do atributo acima 
		 */
		nota3 = 10.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
}