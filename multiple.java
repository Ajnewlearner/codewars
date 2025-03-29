public class multiple {
    public static void main(String[] args) {
        int[] x = {34,3,2};
        
        int mult = 1;
        int length = x.length;
        for(int i = 0; i< length ; i++){
            mult = mult* x[i];
        }
        System.out.println(mult);
    }
}
