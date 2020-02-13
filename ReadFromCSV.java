import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 


public class ReadFromCSV {

    public  static  void  main(String[] args) {


        String csvFile = "C:/Users/EI11635/Desktop/Sample.csv";
        String line = "";
        String csvSplitSeparator = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null)

            {

                // use comma as separator
                String[] detailsArray = line.split(csvSplitSeparator);
                System.out.println();
                for (int i=0; i<detailsArray.length;i++)
                System.out.print(detailsArray[i] +"****");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

 