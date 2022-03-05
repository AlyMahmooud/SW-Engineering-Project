package banksystem;

import java.util.Date;

public class Depostion extends Account {
    private Date date;
    private double Damount;
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDAmount() {
        return Damount;
    }

    public void setAmount(double amount) {
        this.Damount = amount;
    }
   
    public void updateBalance()
    {
        
         setBalance(getBalance()+Damount);
    }
}
