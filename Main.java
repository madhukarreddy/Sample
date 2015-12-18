//Main.java
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.sathya.hibernate.model.Student;
public class Main {
	public static void main(String[] args) {
		SessionFactory  factory=new  Configuration().configure("com/sathya/hibernate/config/hibernate.cfg.xml").buildSessionFactory();
		Session  session=factory.openSession();
		Student  student=new  Student();
		student.setStudentId(111);
		student.setStudentName("STUDENT1");
		student.setMarks(500);
		Transaction  tx=session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
		factory.close();
	}
}
		