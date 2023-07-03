package PayMoney;

public class PayMoney {
    int[] transactions;
    public PayMoney(int numberOfTransactions){
        transactions = new int[numberOfTransactions];
    }
    public void addTranscationsToArray(int index, int value){
        transactions[index] = value;
    }
    public void checkTargetAchieved(int targetValue, int numberOfTransactions) {
        int transactionSum = 0;
        for(int i=0; i<numberOfTransactions; i++){
            transactionSum = transactionSum + transactions[i];
            if(transactionSum>targetValue){
                System.out.println("Target achieved after "+(i+1)+" transaction");
                return;
            }
        }
        System.out.println("Given target is not achieved ");
    }
}
