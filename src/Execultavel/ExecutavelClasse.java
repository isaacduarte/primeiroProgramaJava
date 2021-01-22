package Execultavel;

import CursoJava.Aluno;

public class ExecutavelClasse {

	public static void main(String[] args) {
	
			Aluno aluno1 = new Aluno();//João
			aluno1.setNome("João");
			aluno1.setIdade(11);
			aluno1.setDataNascimento("11/11/1111");
			aluno1.setRG("0516516165");
			aluno1.setCPF("06015588390");
			aluno1.setNomeMae("liduina");
			aluno1.setNomepai("reginaldo");
			aluno1.setDataMatricula("12/12/1212");
			aluno1.setNomeEscola("melo e silva");
			aluno1.setSerieMatriculado("5serie");
			aluno1.setNota1(9);
			aluno1.setNota2(9);
			aluno1.setNota3(6);
			aluno1.setNota4(7);
			
			System.out.println("nome aluno" + aluno1.getNome());
			System.out.println("idade" + aluno1.getIdade());
			System.out.println("data de nascimento" + aluno1.getDataNascimento());
			System.out.println("RG" + aluno1.getRG());
			System.out.println("CPF" + aluno1.getCPF());
			System.out.println("nome da mãe" + aluno1.getNomeMae());
			System.out.println("nome do pai" + aluno1.getNomepai());
			System.out.println("data da matricula" + aluno1.getDataMatricula());
			System.out.println("nome nome da escola" + aluno1.getNomeEscola());
			System.out.println("serie matriculada" + aluno1.getSerieMatriculado());
			System.out.println("Nota 1: " + aluno1.getNota1());
			System.out.println("nota 2: " + aluno1.getNota2());
			System.out.println("nota 3: " + aluno1.getNota3());
			System.out.println("nota 4: " + aluno1.getNota4());
			System.out.println("media" + aluno1.getMedia());
			System.out.println("Aluno :" + (aluno1.getAprovado() ? "aprovado" : "reprovado"));
			
			
			

	}

}
