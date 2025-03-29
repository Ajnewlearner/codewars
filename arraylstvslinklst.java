import java.util.ArrayList;
import java.util.LinkedList;

public class arraylstvslinklst {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        // linked list stores in different memories which helps in adding or removing any element faster
        // they have similar fn. to Arraylist except memory part
        link.add("AJ");
        link.add("CR");
        link.add("DS");
        link.add("KA");
        System.out.println("The chadda "+link.get(1));



        ArrayList<String> arr = new ArrayList<>();
        // It is good for user as retreiving data is easier for computer and or finding them


        arr.add("AJ");
        arr.add("CR");
        arr.add("DS");
        arr.add("KA");
        System.out.println("The chadda "+arr.get(1));
    }
}
