import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File obj=new File("C:/Users/dmani/OneDrive/Desktop/Employee Names.txt");
        Scanner reader = new Scanner(obj);
        ArrayList<String>data=new ArrayList<String>();
        while(reader.hasNextLine()){
            data.add(reader.nextLine());
        }
        System.out.println("Size of the array list is: "+data.size());
        System.out.println("data is: ");
        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i));
        }
        System.out.println("**********");
        for (String n:
             data) {
            System.out.println(n);
        }
        System.out.println("**********");
        Iterator<String>itr= data.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
