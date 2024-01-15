public class Bank {

    private String name;

    public Bank(String name){
        this.name = name;
    }


    public double withdraw(Account accountFrom, double amountToWithdraw) {

        if( accountFrom.getBalance() < amountToWithdraw ){
            System.out.println("Insufficient Funds");
            return -1;
        }
        accountFrom.setBalance(accountFrom.getBalance() - amountToWithdraw);
        return accountFrom.getBalance();
    }

    public double deposit(Account accountTo, double amountToDeposit ) {
        if( amountToDeposit <= 0 ){
            System.out.println("Cannot deposit negative or zero amount");
        }
        accountTo.setBalance(amountToDeposit + accountTo.getBalance());
        return accountTo.getBalance();
    }

    public double transferFunds(Account accountFrom, Account accountTo, double amountToTransfer ){

        withdraw(accountFrom, amountToTransfer);
        deposit(accountTo, amountToTransfer);

        return amountToTransfer;
    }
}
