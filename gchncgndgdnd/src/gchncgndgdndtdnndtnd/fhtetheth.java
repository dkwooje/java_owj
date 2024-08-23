package gchncgndgdndtdnndtnd;



public class fhtetheth {

	public void fileSave(String fileName) {
		try(ObjectOutputString oos =new ObjectOutputString(new FileOutputString(fileName)))
		{
			oos.writeObject(new Food("사과",20));
		}
		catch(Exception e) {}


	}
}
