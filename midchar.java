public class midchar {
    public static String demo(String word){
        int length = word.length();
        String s = word.charAt((length/2)+1);
        return s;
    }
    public static void main(String[] args) {
        String word = "real";
        System.out.println(word[0]);
        char f = 'd';
        char s = 'e';
        String str = String.valueof(f)+String.valueof(s);
    }
}
