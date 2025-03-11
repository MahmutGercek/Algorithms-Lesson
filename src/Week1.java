public class Week1 {
    public static void main(String[] args) {
        /*herhangi  bir N değeri için tek ve çift sayılar toplamı
        Scanner input = new Scanner(System.in);
        System.out.println("N= ");
        int N = input.nextInt();
        int oddsum = 0;
        int evensum = 0;
        for (int i = 0; i <=N; i++) {
            if(i%2==0){
                evensum += i;
            }
            else{
                oddsum += i;
            }
        }
        System.out.println("Odd sum = "+oddsum);
        System.out.print("Even sum = "+evensum);*/
        int[] vectors1 = {2,4,6};
        int[] vectors2 = {1,3,5};
        System.out.println(dotproduct(vectors1,vectors2));


    }
    //************************************************************************************************
    public static void evenodd_sum(int n){
        int oddsum = 0;
        int evensum = 0;
        for (int i = 0; i <=n; i++) {
            if(i%2==0){
                evensum += i;
            }
            else{
                oddsum += i;
            }
        }
        System.out.println("Odd sum = "+oddsum);
        System.out.print("Even sum = "+evensum);
    }
    //************************************************************************************************
    public static void twonumber_sum(int firstnumber,int secondnumber){
        System.out.println("Sum= "+(firstnumber+secondnumber));
    }
    //************************************************************************************************
    public static double average(double endnumber){
        double sum=0;
        for(int i=1;i<=endnumber;i++){
            sum +=i;
        }
        double average = sum / endnumber;
        return average;
    }
    //************************************************************************************************
    public static void array_sum(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum +=array[i];
        }
        System.out.println("Sum = "+sum);
    }
    //************************************************************************************************
    public static double array_average(double[] array){
        double sum = 0;
        for(int i=0;i<array.length;i++){
            sum +=array[i];
        }
        return sum/array.length;
    }
    //************************************************************************************************
    public static int biggestnumber_inarray(int[] array){
        int biggestnumber = array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>biggestnumber){
                biggestnumber = array[i];
            }
        }
        return biggestnumber;
    }
    //************************************************************************************************
    public static int smallestnumber_inarray(int[] array){
        int smallestnumber= array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<smallestnumber){
                smallestnumber = array[i];
            }
        }
        return smallestnumber;
    }
    //************************************************************************************************
    public static int[] vectorsum(int[] array1,int[] array2){
        int[] vectors = new int[array1.length];
        for(int i=0;i<array1.length;i++){
            vectors[i] = array1[i]+array2[i];
        }
        return vectors;
    }
    //************************************************************************************************
    public static int[] Matriks_small(int[][] array){
        int[] numbers = new int[array.length];
        for(int i=0;i<array.length;i++){
            int smallest = array[i][0];
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]<smallest){
                    smallest = array[i][j];
                }
                numbers[i] =smallest;
            }
        }
        return numbers;
    }
    //************************************************************************************************
    public static int[] Matriks_big(int[][] array){
        int[] numbers = new int[array.length];
        for(int i=0;i<array.length;i++){
            int biggest = array[i][0];
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]>biggest){
                    biggest = array[i][j];
                }
                numbers[i] =biggest;
            }
        }
        return numbers;
    }
    //*************************************************************************************************
    public static int dotproduct(int[] array1,int[] array2){
        int sum = 0;
        for(int i=0;i<array1.length;i++){
            sum +=array1[i]*array2[i];
            }
        return sum;
        }
    }
    //*************************************************************************************************
