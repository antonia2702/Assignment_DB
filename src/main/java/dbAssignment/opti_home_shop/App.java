package dbAssignment.opti_home_shop;

import java.util.List;

import javax.persistence.EntityManager;

public class App 
{
    public static void main( String[] args )
    {
       BankRepository b = new BankRepository();
       b.reconnectToDatabase();
       List l = b.findAll();
       b.closeConnection();
       
    }
}
