public class Week2 {
    static int a = 20;
    public static void main(String[] args){
        a = 10;//true
        // int a = 10 = this will be false because an is already defined in week2 block, and it can be used in every block under block week2.
        int b = 10;
        printing();
    }
    public static void printing(){
        int b = 10;
        for(int i = 0; i<=10; i++){
            /*int b=20; --> in nested loops the variable that defined in outer block can be used in blocks that under outer block
                            so we cant define the variable again on inner block.
             */
        }
        System.out.println(a);
    }
}