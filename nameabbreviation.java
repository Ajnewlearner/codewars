
import java.util.Scanner;

public class nameabbreviation {
        public static String abbrevName(String name) {
          int length = name.length();
          String subname ="";
          for (int i = 0 ; i < length ;i++){
            if(name.charAt(i) == ' '){
              subname = String.valueOf(Character.toUpperCase(name.charAt(i+1)));
            }
          }
          String name1 = String.valueOf(Character.toUpperCase(name.charAt(0)));
      //     subname = subname.toUpperCase();
      //     name = name[0]+"."+subname;
          return name1+"."+subname;
        }
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // System.out.println(abbrevName(name));
        nameabbreviation nm = new nameabbreviation();
        System.out.println(nm.abbrevName(name));


    }
}
