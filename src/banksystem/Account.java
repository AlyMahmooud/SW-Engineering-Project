package banksystem;
public class Account extends Database{
        private int password;
        private String userName;
        private double balance;
        private String National_ID;
        private String Address;
        private String Email;
        private int age;
        private String gender;

    public Account() {
    }
         

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }
    public double initBalance()
    {
        balance=0;
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getNational_ID() {
        return National_ID;
    }

    public void setNational_ID(String National_ID) {
        this.National_ID = National_ID;
    }
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void GetAccountDetails(double Balance,String username,String national_ID, String address)
    {
        Balance = balance;
        username = userName;
        national_ID = getNational_ID();
        address = getAddress();
    }
    
}
