package fcu.selab.training;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        String line,temp = null;
		String[] tempArray = new String[10];
		
		try{
			FileReader fr = new FileReader("D:\\git\\input.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while((br.ready())){
				temp = br.readLine();
			}
			
			tempArray = temp.split(",");
			
			int lengh;
			lengh = tempArray.length;	
			
			Arrays.sort(tempArray);
			
			FileWriter fw = new FileWriter("D:\\git\\output.txt");
			
			for(int i=0;i<lengh;i++){
				fw.write(tempArray[i].toLowerCase().substring(0,1) + ". " + tempArray[i] + " ");
			}
			
			fw.flush();
			fw.close();
			
			System.out.println("OK");
		}
		catch(IOException e){
			System.out.println("Fail");
		}
    }
}
