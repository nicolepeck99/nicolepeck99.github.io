package data;
import java.io.*;
import java.util.*;

public class Scan{

   // static HashMap<String, ArrayList<NewPerson>> colors;

    public void getC(){    
        // for (NewPerson r : colors.get("green")) {
        //     System.out.println(r.name +", "+ r.company +", "+ r.date);
        //  }
    
    }


    public static void main(String [] args) throws IOException{
        File newFile = new File ("src/main/java/data/project-data.txt");
        parse(newFile);

    }


    public static Map<String, List<NewPerson>> parse(File data) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader(data));

        Map<String, List<NewPerson>> colors = new HashMap<>();

        // for reading one line
        String line = null;

        NewPerson temp = new NewPerson();

        try {
            
            while ((line = reader.readLine()) != null) {
                
                String[] split = line.split(":");

                //switch for writing in the data needed
                switch (split[0]) {
                    case "Date":
                        temp.date = split[1];
                        break;
                    case "Name":
                        temp.name = split[1];
                        break;
                    case "Company":
                        temp.company = split[1];
                        break;
                    case "Color":
                        // add the person to the hashmap
                        
                        // checking if object is in map
                        if (colors.get(split[1]) == null) {
                            colors.put(split[1], new ArrayList<NewPerson>());
                        } 
                        
                        colors.get(split[1]).add(temp);
                        
                        // System.out.println("The green is: " + colors.get("green"));

                        temp = new NewPerson();
                        break;
                    default:
                        break;
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }

        

        //System.out.println(colors);
        
        // for (NewPerson r : colors.get("green")) {
        //    System.out.println(r.name +", "+ r.company +", "+ r.date);
        // }


        reader.close();
        
        return colors;
        
  } //end of main


    public static Map<String, List<NewPerson>> parse(String string) {
        try {
            return parse(new File (string));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return Collections.emptyMap();
        }
    }
}


