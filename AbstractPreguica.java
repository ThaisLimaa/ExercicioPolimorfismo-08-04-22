package ExercíciosGeneration.OitodeAbril;

public class AbstractPreguica extends AbstractAnimal{

public AbstractPreguica() 
	{
		super("Animal: Preguiça.");
	}

	@Override
	public void nome(String nome) 
	{
		System.out.println("Nome: " +nome+ ".");
	}

	@Override
	public void idade(int idade) 
	{
		System.out.println("Idade: " + idade + " anos.");
	}

	@Override
	public void som(String som) 
	{
		System.out.println("Som: "+som);
	}
}