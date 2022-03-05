package banksystem;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Database {
     
   
    public int login(String username , int pass)
    {
        try {
            int count =0;
            Class.forName("com.mysql.jdbc.Driver");
            
                   Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","");
            Statement st = c.createStatement();
            String sql="select count(1) from  account1 Where name='"+username+"' and password='"+pass+"'";
            
            ResultSet rs =st.executeQuery(sql);
            while(rs.next())
            {
                count=rs.getInt("count(1)"); 
            }
            return count;
            }
            
        catch (SQLException ex) {
                             Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                            int count =-1;
                             return count;
                                }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
             int count =-2;
                             return count;
        }
    }
    public void registration(String username,int pass,int age1,String add,String gend,String nid,String Email,double balance1){
       try {
           
          Class.forName("com.mysql.jdbc.Driver");
            
                   Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","");
           Statement st= c.createStatement();
           String sql="insert into account1(name,password,address,age,gender,nationalid,email,balance) VALUES('"+username+"','"+pass+"','"+add+"','"+age1+"','"+gend+"','"+nid+"','"+Email+"','"+balance1+"')";
           st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null, "register successfully", "success", JOptionPane.INFORMATION_MESSAGE);
           st.close(); 
           c.close(); 
           
           
       } 
       catch (SQLException ex)
       {
           
           JOptionPane.showMessageDialog(null, "MySQL Exception!!", "Erorr", JOptionPane.ERROR_MESSAGE);
       } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "MySQL Connector Not Found!!", "Erorr", JOptionPane.ERROR_MESSAGE);
        }
       
   }
    public Account getData(String username,Account a)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","");
            
            String sql="select * from  account1 Where name='"+username+"' ";    
            PreparedStatement st = c.prepareStatement(sql);
             ResultSet rs =st.executeQuery(sql);
            while(rs.next()){
                a.setAddress(String.valueOf(rs.getString("address")));
               a.setNational_ID(String.valueOf(rs.getString("nationalid")));
                a.setBalance(rs.getDouble("balance"));
                a.setUserName(String.valueOf(rs.getString("name")));
                
           }
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
             
        }
            return a;       
    }
    public void updatebalance(WithdrawC w)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
              Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","");
           Statement st= c.createStatement();
           String sql="update account1 set balance='"+w.getBalance()+"'where name='"+w.getUserName()+"'";
           int result = st.executeUpdate(sql);
           if(result==1)
           {
                JOptionPane.showMessageDialog(null, "Operation done successfully", "success", JOptionPane.INFORMATION_MESSAGE);
           }
        } 
        catch (ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "MySQL Exception!!", "Erorr", JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "MySQL Exception!!", "Erorr", JOptionPane.ERROR_MESSAGE);
        }
            
                 
    }
        public void updatebalance(Depostion w)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
              Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","");
           Statement st= c.createStatement();
           String sql="update account1 set balance='"+w.getBalance()+"'where name='"+w.getUserName()+"'";
           int result = st.executeUpdate(sql);
           if(result==1)
           {
                JOptionPane.showMessageDialog(null, "Operation done successfully", "success", JOptionPane.INFORMATION_MESSAGE);
           }
        } 
        catch (ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "MySQL Exception!!", "Erorr", JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "MySQL Exception!!", "Erorr", JOptionPane.ERROR_MESSAGE);
        }
            
                 
    }
}
