package ExercíciosGeneration.OitodeAbril;

public abstract class AbstractAnimal {

	public String animal;
	
	public AbstractAnimal (String animal)
	{
		this.animal = animal;
	}
		
	
	abstract public void nome(String nome);
	abstract public void idade(int idade);
	abstract public void som(String som);


	public String getAnimal() 
	{
		return animal;
	}

	public void setAnimal(String animal) 
	{
		this.animal = animal;
	}	
}