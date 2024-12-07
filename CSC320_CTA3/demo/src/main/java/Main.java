import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[5];{
    

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter next number: " );
            numbers[i] = input.nextDouble();        
    }

    double Total = 0;
    double Average = 0;
    double Max = 0;
    double Min = 0;

        for (int i = 0; i < numbers.length; i++){
        Total += numbers[i];
        if(numbers[i] > Max){
            Max = numbers[i];
        }

        if(numbers[i] < Min){
            Min = numbers[i];
        }

    }

    Average = Total / numbers.length;

    System.out.println("Total: " + Total);
    System.out.println("Average: " + Average);
    System.out.println("Maximum: " + Max);
    System.out.println("Minimum: " + Min);
    System.out.println("Intrest at 20%: " + (Total * 0.2));
    
    input.close();
    }
}
}
