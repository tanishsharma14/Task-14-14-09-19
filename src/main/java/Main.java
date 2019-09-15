

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Employee emp=new Employee(105,"Durgesh",2000);
		Transaction tx=session.beginTransaction();
		
		// Add a employee
		
	/*	session.save(emp); */
		
		
		//deleting a employee
		
		/*Employee emp2=(Employee) session.get(Employee.class,102);
		session.delete(emp);*/
		
		
		//updating a employee
		Employee emp3=new Employee(105,"Duegesh Bagwan",9000);
		session.update(emp3);
		tx.commit();
		
		session.close();
		
		

	}

}
