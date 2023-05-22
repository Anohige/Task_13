import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Task_3 {
    public static void main(String[] args) throws FileNotFoundException {
        File obj=new File("C:/Users/dmani/OneDrive/Desktop/Employee Names.txt");
        Scanner reader = new Scanner(obj);
        TreeSet<String>data=new TreeSet<String>();
        while(reader.hasNextLine()){
            data.add(reader.nextLine());
        }
        Iterator<String>itr= data.iterator();
        System.out.println("Data is: ");
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
