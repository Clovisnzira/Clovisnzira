import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accList = new ArrayList<>();
        accList.add(new Account(1, "Clovis Nziraguhindwa","Deposing", "450000","0.20"));
        accList.add(new Account(2, "Gaspard Niyonkuru","Credit", "789000", "0.13"));
        accList.add(new Account(3, "Schadrack Dusengimana","Checking","900000","0.10"));
        accList.add(new Account(4, "Anastasie Mukakarera","Saving", "347000", "0.17"));
        accList.add(new Account(5, "Gerardine Gahimbare","Checking", "620800","0.16"));
        accList.add(new Account(6, "Beranard Bucumi","Deposit","8346500","0.19"));
        accList.add(new Account(7, "Fabrice Arakaza","Credit", "865000",  "0.14"));
        accList.add(new Account(8, "Fred Tuyizere","Debit", "1240000",   "0.12"));
        accList.add(new Account(9, "Sylvestre Nkunzimana","Saving", "8830000", "0.10"));
        accList.add(new Account(10, "Andrew Manariyo","Checking","6720890","0.11"));



        for (Account acc:accList){
            System.out.println(acc);
        }
    }
}