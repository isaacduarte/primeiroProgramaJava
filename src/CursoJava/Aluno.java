package CursoJava;

public class Aluno {
	
	private String nome;
	private int idade;
	private String dataNascimento;
	private String RG;
	private String CPF;
	private String nomeMae;
	private String nomepai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
public Aluno() {
	// TODO Auto-generated constructor stub
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public String getDataNascimento() {
	return dataNascimento;
}

public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}

public String getRG() {
	return RG;
}

public void setRG(String rG) {
	RG = rG;
}

public String getCPF() {
	return CPF;
}

public void setCPF(String cPF) {
	CPF = cPF;
}

public String getNomeMae() {
	return nomeMae;
}

public void setNomeMae(String nomeMae) {
	this.nomeMae = nomeMae;
}

public String getNomepai() {
	return nomepai;
}

public void setNomepai(String nomepai) {
	this.nomepai = nomepai;
}

public String getDataMatricula() {
	return dataMatricula;
}

public void setDataMatricula(String dataMatricula) {
	this.dataMatricula = dataMatricula;
}

public String getNomeEscola() {
	return nomeEscola;
}

public void setNomeEscola(String nomeEscola) {
	this.nomeEscola = nomeEscola;
}

public String getSerieMatriculado() {
	return serieMatriculado;
}

public void setSerieMatriculado(String serieMatriculado) {
	this.serieMatriculado = serieMatriculado;
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

public double getNota4() {
	return nota4;
}

public void setNota4(double nota4) {
	this.nota4 = nota4;
}
	public double getMedia() {
		
		
		return (nota1+nota2+nota3+nota4)/4;
	}
	public boolean getAprovado() {
	double media= getMedia();
		if(media>=7) {
			return true;
		}else {
			return false;
		}
	}
}
