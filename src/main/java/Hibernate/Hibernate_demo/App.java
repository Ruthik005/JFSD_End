package Hibernate.Hibernate_demo;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.criterion.Restrictions;
//import org.hibernate.criterion.Restrictions;

public class App 
{
	@SuppressWarnings("deprecation")
    public static void main( String[] args )
    {
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
       Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory sf = md.getSessionFactoryBuilder().build();
        Session s = sf.openSession();
        Transaction t;
        Employee e=new Employee();
        e.setFn("Kl");
        e.setLn("Rahul");
        s.save(e);
        t=s.beginTransaction();
        t.commit();
       System.out.println("Employee record inserted sucessfully.."); 
       
        RegularEmp re=new RegularEmp();
        re.setFn("Goutham");
        re.setLn("Gambhir");
        re.setDept("Cricket");
        re.setDesign("BCCI");
        re.setSalary(30000000.00);
        s.save(re);
        t=s.beginTransaction();
        t.commit();
        System.out.println("Regular employee Record Inserted sucessfully..");
        
        DailyEmp de=new DailyEmp();
        de.setFn("Rahul");
        de.setLn("Dravid");
        de.setExp(5);
        de.setDailywages(500.00);
        s.save(de);
        t=s.beginTransaction();
        t.commit();
        System.out.println("Daily Employee Record Inserted Sucessfully..");
        
        
 /* Employee e=new Employee();
  e.setFn("Hardik");
  e.setLn("Pandya");
  s.save(e);   //Session object saves the record in Employee
  t=s.beginTransaction();
  t.commit();
        System.out.println( "Record Inserted successfully" );*/
        
        /*Employee r=s.find(Employee.class, 1);
        r.setFn("Rahul");
        r.setLn("RamKrishna");
        s.save(r);   //Session object saves the record in Employee
        t=s.beginTransaction();
        t.commit();
              System.out.println( "Record Updated successfully" );
              System.out.println("First name after Update"+r.getFn());
              System.out.println("Last name after Update"+r.getLn());*/
        
      /*  Employee r=s.find(Employee.class, 1);
        
        s.delete(r);   //Session object saves the record in Employee
        t=s.beginTransaction();
        t.commit();
              System.out.println( "Record deleted successfully" );*/
        
      
      /*  Criteria c = s.createCriteria(Employee.class);
        c.add(Restrictions.gt("id", 2));
        @SuppressWarnings("unchecked")
        List<Employee> L = c.list();

        System.out.println("First row Id :" + L.get(0).getId());
        System.out.println("First row First name :" + L.get(0).getFn());
        System.out.println("Second Row Id :" + L.get(1).getId());
        System.out.println("Second row First Name :" + L.get(1).getFn());*/
              
    }
}
