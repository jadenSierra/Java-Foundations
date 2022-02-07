public class CafeJava {
    public static void main(String[] args){
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 3.5;
        int dripCoffee = 2;
        double latte = 3.5;
        double cappuccino = 3.5;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 =  "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;



    System.out.println(generalGreeting + customer1);
    System.out.println(displayTotalMessage + dripCoffee + pendingMessage);
    System.out.println(generalGreeting + customer4);
    System.out.println(displayTotalMessage + cappuccino + pendingMessage);
        if(isReadyOrder4){
            System.out.println(readyMessage);
        }
    System.out.println(generalGreeting + customer2);
    System.out.println(displayTotalMessage + (latte + latte));
        if(isReadyOrder2){
            isReadyOrder2 = false;
            System.out.println(readyMessage);
        } else {
            isReadyOrder2 = true;
            System.out.println(pendingMessage);
        }
    System.out.println(generalGreeting + customer3);
    System.out.println(displayTotalMessage + (latte - dripCoffee));

    }
}