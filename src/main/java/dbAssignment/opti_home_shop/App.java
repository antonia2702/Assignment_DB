package dbAssignment.opti_home_shop;

import java.util.Iterator;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
       BankRepository b = new BankRepository();
       b.reconnectToDatabase();
       List<Bank> l = b.findAll();
       Iterator<Bank> i = l.iterator();
       while(i.hasNext()) {
    	   System.out.println(i.next().toString());
       }
       b.closeConnection();
       
       ArticleGroupRepository a = new ArticleGroupRepository();
       a.reconnectToDatabase();
       List<ArticleGroup> articleGroupList = a.findAll();
       Iterator<ArticleGroup> i1 = articleGroupList.iterator();
       while(i1.hasNext()) {
    	   System.out.println(i1.next().toString());
       }
       a.closeConnection();
    }
}
