package Max_algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by Home on 15.11.2015.
 */
public class Max_algorithm
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        String stroka = reader.readLine();
        int count = Integer.parseInt(stroka);

        for (int i = 1; i < count + 1; i++)

        {
            if (count % i == 0)
            {
                list.add(i);
            }
        }

        for (Integer x : list)
        {
            System.out.print(x + " ");
        }

    }

}
