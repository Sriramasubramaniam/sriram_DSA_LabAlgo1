import PayMoney.PayMoney;
import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of transaction array");
        int numberOfTransactions = sc.nextInt();

        PayMoney payMoney = new PayMoney(numberOfTransactions);

        System.out.println("enter the values of array");
        for(int i=0; i<numberOfTransactions; i++)
        {
            int inputTransaction = sc.nextInt();
            payMoney.addTranscationsToArray(i,inputTransaction);
        }

        System.out.println("enter the total no of targets that needs to be achieved");
        int totalTargets = sc.nextInt();
        for(int i=0; i<totalTargets; i++){
            System.out.println("enter the value of target");
            int targetValue = sc.nextInt();
            payMoney.checkTargetAchieved(targetValue, numberOfTransactions);
        }
        sc.close();
    }
}


