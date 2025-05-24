public class midchar {
    public static String demo(String word){
        int length = word.length();
        int len = length/2;
        if(length%2 ==0)
            return String.valueOf(word.charAt(len))+String.valueOf(word.charAt(len+1));
        else{
            return String.valueOf(word.charAt(len));
        }
    }
    public static void main(String[] args) {
        String word = "real";
        midchar mid = new midchar(); 
        System.out.println(mid.demo(word));
    }
}
