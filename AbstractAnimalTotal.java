package ExercíciosGeneration.OitodeAbril;

public class AbstractAnimalTotal {

	public static void main(String[] args) {
		
		AbstractCachorro cachorro = new AbstractCachorro();
		AbstractCavalo cavalo = new AbstractCavalo();
		AbstractPreguica preguica = new AbstractPreguica();
		
		System.out.println(cachorro.getAnimal());
		cachorro.nome("Apolo.");
		cachorro.idade(2);
		cachorro.som("Latir.");
		 System.out.println("\n-------------------------------------------\n");
		
		System.out.println(cavalo.getAnimal());
		cavalo.nome("Pé de Pano.");
		cavalo.idade(25);
		cachorro.som("Relinchar.");
		 System.out.println("\n-------------------------------------------\n");
		
		System.out.println(preguica.getAnimal());
		preguica.nome("Flash.");
		preguica.idade(32);
		preguica.som("Alta-frequência pelas narinas.");
	}

}
