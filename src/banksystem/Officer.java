package banksystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Officer extends Database{
        private String Address;
        private double ID;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }
       public int login(int officerid)
    {
        try {
            int count =0;
            Class.forName("com.mysql.jdbc.Driver");
            
                   Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","");
            
            Statement st = c.createStatement();
            String sql="select count(1) from  officer Where officerid='"+officerid+"'";
            ResultSet rs =st.executeQuery(sql);
            while(rs.next())
            {
                count=rs.getInt("count(1)");
                
            }
            return count;
            }
            
        catch (SQLException ex) 
        {
          Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
           int count =-1;
             return count;
        } 
        catch (ClassNotFoundException ex) 
        {
                Logger.getLogger(Officer.class.getName()).log(Level.SEVERE, null, ex);
                 int count =-2;
                             return count;
            }
    }
}
