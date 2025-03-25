import java.util.Scanner;
public class EXO4 {
    public  static void  main(String[] args){
        double cost_price,selling_price, profit,profit_pr;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the cost_price:");
        cost_price=input.nextDouble();
        System.out.print("enter the selling_price:");
        selling_price=input.nextDouble();
        profit= selling_price-cost_price;
        profit_pr=(profit/cost_price)*100;
        System.out.println("the profit  is: "+ profit+"\nthe pourcentage of profit is: "+profit_pr);
        input.close();
    }  
}
