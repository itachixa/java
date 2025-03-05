package Week4.LEVEL1_pratique;
import java.util.Scanner;
public class arrayparity {
    public static void main(String[] args) {
        int  TargetNumber,number,index_e,index_o,size ;
        index_e=0;
        index_o=0;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
       TargetNumber= input.nextInt();

        int[] odd = new int[(TargetNumber/2)+1];
        int[] even = new int[(TargetNumber/2)+1];

        for (int i=1;i<TargetNumber+1;i++){
             if (i%2==0){
                
                odd[index_o]=i;
                index_o+=1;
             }else{
                even[index_e]=i;
                index_e+=1;
             }
        }
        size=(TargetNumber/2)+1;
        System.out.println("the list of even number is ");
        for(int i=0;i<size;i++){
            if(even[i]!=0){
                System.out.println(even[i]);
            }
            
        }

        System.out.println("the list of odd number is ");
        for(int i=0;i<size;i++){
            if (odd[i]!=0){
                System.out.println(odd[i]);
            }
           
        }
    }
}
