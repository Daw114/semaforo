package clases;
import java.util.Random;
/**
 * La clase ordenador contiene datos sobre el ordenador
 * 
 * @author Iker Perez
 * @version 1.0
 */
public class ordenador {
    public ordenador() {}
    public String color(){
    	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(3);
	if(randomInt == 0)
	{  return "rojo";}
	else if(randomInt == 1)
	{ return "amarillo";}
	else
	{ return "verde";}
    }
}
