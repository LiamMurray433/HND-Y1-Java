import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MenuOptions {

    public void option1() {

        String csvFile = "C:\\Programming\\Java-Projects\\student-accounts-record\\src\\PurchaseHistory.csv";
        System.out.println("Your Purchase History");
        try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }

    public void option2() {
        System.out.println("Dashboard");
    }

    public void option3() {
        System.out.println("Your student account Details");
    }

    public void exit() {
        System.out.println("Logout ");
        System.exit(0);
    }
}
