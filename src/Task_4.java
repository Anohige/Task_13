import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task_4 {
    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("C:/Users/dmani/OneDrive/Desktop/Employee Names.txt");
        Scanner reader = new Scanner(obj);
        ArrayList<String> data = new ArrayList<String>();
        while (reader.hasNextLine()) {
            data.add(reader.nextLine());
        }
        System.out.println("data is: ");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
        System.out.println("\nSorted data is: ");
        Collections.sort(data);
        for (String n:
                data) {
            System.out.println(n);
        }
    }
}