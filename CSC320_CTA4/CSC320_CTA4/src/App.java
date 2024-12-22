import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        //Create Array Lists and Initialize
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> dailyTemp = new ArrayList<>();

        //Prompt for input
        for(int i = 0; i < 7; i++){
            System.out.println("Enter the week day: ");
            String day = scan.nextLine();
            System.out.println("Enter the average temperature for " + day);
            double temp = scan.nextDouble();

            //Add entered values to the array
            scan.nextLine();
            daysOfWeek.add(day);
            dailyTemp.add(temp);
        }

        //Retrive the data
        while(true){
            System.out.println("Enter day of the week: ");
            String inputDay = scan.nextLine();

            if(inputDay.equalsIgnoreCase("week")){
                //Figure out and show weekly avearge temp
                double weekAverage = calculateWeekAverage(dailyTemp);
                System.out.println("Average weekly temp= " + weekAverage);
            } else if(daysOfWeek.contains(inputDay)){
            //Show specific days temp
            int index = daysOfWeek.indexOf(inputDay);
            double temp = dailyTemp.get(index);
            System.out.println("Temperature for the day " + inputDay + " is: " + temp);
            } else{
                System.out.println("Invalid input detected, please enter a valid day or 'week' for the weekly average");
            }

            //Continue?
            System.out.println("Check another day or weekly average? y/n");
            String newInput = scan.nextLine();
            if(!newInput.equalsIgnoreCase("y")){
                break;
            }
        }

        scan.close();
    }

        //Calculate Average Temp
        private static double calculateWeekAverage(ArrayList<Double> temps){
            double sum = 0;
            for(double temp : temps){
                sum += temp;
            }
            return sum / temps.size();
        }
}

