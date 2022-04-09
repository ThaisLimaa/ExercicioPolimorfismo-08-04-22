package Exerc�ciosGeneration.OitodeAbril;

public class AbstractCavalo extends AbstractAnimal {

	public AbstractCavalo() 
	{
		super("Animal: Cavalo.");
	}
	
	@Override
	public void nome(String nome) 
	{
		System.out.println("Nome: "+nome+ ".");
	}
	
	@Override
	public void idade(int idade) 
	{
		System.out.println("Idade: "+idade+ " anos.");
	}
	
	@Override
	public void som(String som) 
	{
		System.out.println("Som: \n"+som);
	}	
	
	
}
