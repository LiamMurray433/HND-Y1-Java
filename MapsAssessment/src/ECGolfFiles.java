import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class ECGolfFiles 
{

  public ECGolfFiles() 
   {
        
   }
   
 public Map<String,Golfer> loadFile(String filename)
 {
   
    File myFile = new File(filename);
    Map<String,Golfer> cpMap = new HashMap<>();  
    Golfer golf;  // used to hold a golfers data
    String data="";  //  holds data read from a file  
     
    System.out.println("\nReading file "+myFile.getName()+ " \n");
    
    try 
       {
         FileReader fr = new FileReader(myFile);  
         BufferedReader br = new BufferedReader(fr); 
    
         while(  (data = br.readLine()) != null   )
          {
            System.out.println("information on FILE : "+data);
             
            StringTokenizer st = new StringTokenizer(data,",");
             
            while(st.hasMoreTokens())
              {
                golf = new Golfer(st.nextToken().trim(),
                                  Integer.parseInt(st.nextToken().trim()),
                                  Double.parseDouble(st.nextToken().trim()),
                                  st.nextToken().trim());
                    String key = golf.setKey();  // user should create this
                  cpMap.put(key, golf);
                
              }// end of while tokens     
            }// end of while    
             
            System.out.println("\n=============== End of Data ===============\n");
           
         } 
        catch (IOException e) 
         {
           System.out.println("An error has occurred while loading data");  
         }

    return cpMap;
 }
    
}
