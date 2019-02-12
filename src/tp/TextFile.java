package tp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFile{

	String[] file;
	
	public TextFile(String path){
		try {
			  String filestring = new Scanner(new File(path)).useDelimiter("\\A").next();
			  file = filestring.split( "\\r\\n" );
		} catch (IOException e) {
			System.out.println( "Introuvable : " + path );
		}
	}

}
