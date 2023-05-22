import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) throws FileNotFoundException {
        HashSet<String>data=new HashSet<String>();
        File obj=new File("C:/Users/dmani/OneDrive/Desktop/Employee Names.txt");
        Scanner reader = new Scanner(obj);
        while(reader.hasNextLine()){
            data.add(reader.nextLine());
        }
        System.out.println("Size of the Hashset is: "+data.size());
        System.out.println("data is: ");
        Iterator<String>itr= data.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
//        if(data.contains("Anirudh Duraimohan")){
//            System.out.println("yes");
//        }
    }
}
