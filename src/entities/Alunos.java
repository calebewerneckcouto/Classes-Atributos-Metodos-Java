package entities;

public class Alunos {
	
	private String nome;
	private double n1;
	private double n2;
	private double n3;
	
	
	
	
  public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public double getN1() {
		return n1;
	}




	public void setN1(double n1) {
		this.n1 = n1;
	}




	public double getN2() {
		return n2;
	}




	public void setN2(double n2) {
		this.n2 = n2;
	}




	public double getN3() {
		return n3;
	}




	public void setN3(double n3) {
		this.n3 = n3;
	}




public String Student(double n1,double n2, double n3) {
	  
	      double notaFinal = n1+n2+n3;
	      
	      double percentual = (notaFinal / 100) * 100;
	      
	    
	      
	      if(percentual > 60 ) {
	    	  return "Aprovado" + " com nota igual a: " + notaFinal;
	      }else {
	    	  return "Reprovado" + " com nota igual a: " + notaFinal;
	      }
	  
	 
	  
  }

}
