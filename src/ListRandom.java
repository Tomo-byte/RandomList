import java.util.Collections;
import java.util.ArrayList;

/*
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
*/

public class ListRandom {

public static void main(String[] args) //throws IOException
	{
	
	
//	Path filename = Paths.get("/Users/tomo/Downloads", "numbers.txt");
    
	ArrayList<String> myArray = new ArrayList<String>(); 
    myArray.add("2");
    myArray.add("3");
    myArray.add("4");
    myArray.add("5");
    myArray.add("6");
    myArray.add("7");
    myArray.add("8");
    myArray.add("12");
    myArray.add("15");
    myArray.add("16");
    myArray.add("17");
    myArray.add("18");
    myArray.add("19");
    myArray.add("20");
    myArray.add("24");
    
/*  Charset charset = Charset.forName("ISO-8859-1");
    
	List<String> myArray = Files.readAllLines(filename, charset);
	
	Collections.shuffle(result);
	
	System.out.println("\nListe : \n"+ result); */
	
	
	
    System.out.println("\nListe : \n"+ myArray);
    
    Collections.shuffle(myArray);
    
    System.out.println("\nRandom Liste : \n" + myArray);
  	}
}