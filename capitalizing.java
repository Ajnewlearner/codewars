public class capitalizing {
    public static void main(String[] args) {
        String phrase ="new day new drip";
        String[] str= phrase.split(" ");
        for(int i = 0; i< str.length;i++){
            String a = str[i].substring(0,1);
            a = a.toUpperCase();
            System.out.print(a+""+str[i].substring(1)+" ");
        }

        
        // String str = phrase.substring("1");

    }
}
// import java.util.ArrayList;
// public class JadenCase {

// 	public String toJadenCase(String phrase) {
// 		// TODO put your code below this comment
//     String[] str= phrase.split(" ");
//     if(phrase == null|| phrase.isEmpty()){
//       return null;
//     }
//     ArrayList<String> temp = new ArrayList<>();
//         for(int i = 0; i< str.length;i++){
//             String a = str[i].substring(0,1);
//             a = a.toUpperCase();
//             temp.add(a+""+str[i].substring(1)+" ");
//         }
//     String s = temp;
//     return s;
// 	}

// }