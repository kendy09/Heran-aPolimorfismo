package br.com.generation.interfaces;

public class Preguica extends Animal {

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return super.getIdade();
	}

	@Override
	public void setIdade(int idade) {
		// TODO Auto-generated method stub
		super.setIdade(idade);
	}

	@Override
	public void EmitirSom() {
		// TODO Auto-generated method stub
		System.out.println("A preguiça faz barulho");
	}

	
	public void SubirEmArvore() {
		// TODO Auto-generated method stub
		System.out.println("A preguiça sobe em arvore");
	}

}
