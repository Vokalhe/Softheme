package Input_data;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
/**
 * Created by Home on 15.11.2015.
 */
public class Input_data
{
    public static void main(String[] args) throws IOException
    {
       try
       {
           File myFile = new File("C:\\Users\\Home\\Desktop\\input.txt");
           FileReader fileReader = new FileReader(myFile);
           BufferedReader reader = new BufferedReader(fileReader);
           String stroka = reader.readLine();
           int count = stroka.length();
           String length = Integer.toString(count);
           //System.out.println(count); проверка
           FileWriter writer = new FileWriter("C:\\Users\\Home\\Desktop\\output.txt");
           writer.write(length);
           writer.close();
       }
       catch (IOException ex)
       {
           ex.printStackTrace();
       }

    }
}
