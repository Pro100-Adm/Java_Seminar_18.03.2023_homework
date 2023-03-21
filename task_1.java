import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class task_1 {

    public static void addNumber(String key, int value, HashMap<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    
    public static void printBook(HashMap<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        while (true){
        Scanner operationScanner = new Scanner(System.in);
        System.out.print("Enter operation: ");
        String operation = operationScanner.nextLine();
        if (operation.equals("1")){
            Scanner nameScanner = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = nameScanner.nextLine();
            Scanner phoneScanner = new Scanner(System.in);
            System.out.print("Enter phone: ");
            String phone = phoneScanner.nextLine();
            addNumber(name, Integer.parseInt(phone), bookPhone);
        }else{
            if (operation.equals("2")){
                printBook(bookPhone);
            }
        }
        }
       }
}