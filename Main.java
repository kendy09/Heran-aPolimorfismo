package br.com.generation.interfaces;

public class Main {
	public static void main(String[]args) {
		Preguica Preguicinha = new Preguica();
		Cachorro Catioro = new Cachorro();
		Cavalo PeDePano = new Cavalo();
		Catioro.setNome("Babi");
		PeDePano.setNome("Pe de pano");
		Preguicinha.setIdade(12);
		System.out.println("O nome do cachorro � "+Catioro.getNome()
							+"O nome do cavalo � "+PeDePano.getNome()
							+"A pregui�a tem "+Preguicinha.getIdade()+" de idade");
		Catioro.EmitirSom();
		Catioro.Correr();
		PeDePano.EmitirSom();
		PeDePano.Correr();
		Preguicinha.SubirEmArvore();
		Preguicinha.EmitirSom();
	}
}
