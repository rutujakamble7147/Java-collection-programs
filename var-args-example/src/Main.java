/*public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40};
        printSumOfElements(arr);
        printSumOfElementsUsingVarArgs(10,20,30,40);
    }
    public static void printSumOfElements(int... arr){
         int sum=0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println(sum);
    }
    public static void printSumOfElementsUsingVarArgs(int... arr){
        int sum=0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println(sum);
   }
}

 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50};
        printSumOfElement(arr);
        printSumOfElementUsingVarArgs(10,20,30,40);
    }
    public static void printSumOfElement (int []arr){
        int sum = 0;
        for (int j : arr) {
            sum=sum + j;
        }
        System.out.println(sum);
    }
    public static void printSumOfElementUsingVarArgs(int...arr){

        int sum=0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println(sum);
    }
    }
