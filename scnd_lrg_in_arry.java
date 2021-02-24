import java.util.Scanner;
public class scnd_lrg_in_arry {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of elements in the integer array:");int noOfElements = sc.nextInt();
int array[] = new int[noOfElements];
System.out.println("Enter the "+noOfElements+" elements:");
for(int i=0;i<noOfElements;i++) {
array[i] = sc.nextInt();
}
int temp;                                                                                       for(int i = 0; i<array.length; i++ ){
         for(int j = i+1; j<array.length; j++){                                                 
            if(array[i]>array[j]){                                                                             temp = array[i];
               array[i] = array[j];
               array[j] = temp;}}}

System.out.println("\nSecond largest number is:" + array[array.length-2]);
sc.close();}
}
