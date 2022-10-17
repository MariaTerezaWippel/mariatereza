package fixacao;

import java.util.ArrayList;

public class AnimalMain {
	public static void main(String [] args) {
		ArrayList<Gato> gatinhos = new ArrayList<>();
		
		Gato gato1 = new Gato();
		gato1.setNome("Gato 1");
		gato1.setNumerodePatas(4);
		gato1.setRaca("Maine Coon");
		gato1.setEcossistema("Fazenda");
		gato1.setCor("Cinza");
		gato1.setComprimento(30.0f);
		
		gatinhos.add(gato1);
		
		Gato gato2 = new Gato();
		gato2.setNome("Gato 2");
		gato2.setNumerodePatas(4);
		gato2.setRaca("Siames");
		gato2.setEcossistema("Casa");
		gato2.setCor("Brnaco e marrom");
		gato2.setComprimento(20.0f);
		
		gatinhos.add(gato2);
				
		Gato gato3 = new Gato();
		gato3.setNome("Gato 3");
		gato3.setNumerodePatas(4);
		gato3.setRaca("Vira Lata");
		gato3.setEcossistema("Rua");
		gato3.setCor("Laranja e branco");
		gato3.setComprimento(25.0f);
					
		gatinhos.add(gato3);
		
		ArrayList<Cachorro> doguinhos = new ArrayList<>();
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setNome("Cachorro 1");
		cachorro1.setNumerodePatas(4);
		cachorro1.setRaca("Pincher");
		cachorro1.setEcossistema("Casa");
		cachorro1.setCor("Preto");
		cachorro1.setComprimento(5.0f);
					
		doguinhos.add(cachorro1);
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setNome("Cachorro 2");
		cachorro2.setNumerodePatas(4);
		cachorro2.setRaca("Pastor alemão");
		cachorro2.setEcossistema("Fazenda");
		cachorro2.setCor("Preto e marrom");
		cachorro2.setComprimento(25.0f);
					
		doguinhos.add(cachorro2);
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.setNome("Cachorro 3");
		cachorro3.setNumerodePatas(4);
		cachorro3.setRaca("Golden Retriver");
		cachorro3.setEcossistema("Apartamento");
		cachorro3.setCor("Dourado");
		cachorro3.setComprimento(30.0f);
					
		doguinhos.add(cachorro3);
		
		for (Gato gato : gatinhos) {
			System.out.println(gato.getNome());
			System.out.println(gato.getNumerodePatas());
			System.out.println(gato.getRaca());
			System.out.println(gato.getEcossistema());
			System.out.println(gato.getCor());
			System.out.println(gato.getComprimento());
		}
		for (Cachorro cachorro : doguinhos) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getNumerodePatas());
			System.out.println(cachorro.getRaca());
			System.out.println(cachorro.getEcossistema());
			System.out.println(cachorro.getCor());
			System.out.println(cachorro.getComprimento());
		}
		
		
	}

}
