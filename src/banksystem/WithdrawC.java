package banksystem;

import java.util.Date;

public class WithdrawC extends Account {
    private Date date;
    private double Wamount;
    
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getWAmount() {
        return Wamount;
    }

    public void setWAmount(double amount) {
        this.Wamount = amount;
    }
    public boolean checkBalance()
    {
       return (getBalance()>=Wamount);
    }
    public boolean updateBalance()
    {
        if(checkBalance())
        {
            setBalance(getBalance()-Wamount);
            return true;
        }
        else
            return false;
            
    }
    
    
}
