import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {

        int count = 1;
        int sum = 0;
        while(count < 11){
            sum = sum + count;
            count++;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double total = 0.0;
        for(int i = 0; i < prices.length; i++){
            total = total + prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        
        for(int i = 0; i < menuItems.size(); i++){
            String nameOfItem = menuItems.get(i);
            System.out.println(i +" " + nameOfItem);
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello," + userName + "!");
        System.out.println(String.format("There are %d people in front of you", customers.size()));
        customers.add(userName);
    }
} 