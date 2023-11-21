package application;

import Entities.Account;
import Entities.BussinessAccount;
import Entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001,"Alex", 500.00,0.01));
        list.add(new BussinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1003,"Lisa", 300.00,0.01));
        list.add(new BussinessAccount(1004, "Ana", 500.0, 500.0));

        double sum = 0.0;
        //loop para pegar o saldo de todas as contas, independente do tipo de conta
        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: $%.2f", sum);
        //para cada conta acc na minha lista, eu vou implementar o seguinte metodo:
        for (Account acc : list) {
            acc.deposit(10.0);
        }
        System.out.println();
        for (Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n",acc.getNumber(), acc.getBalance());
        }
    }
}