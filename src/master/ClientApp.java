package master;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientApp {

	public static void main(String[] args) {
		Animes animes = new Animes();
		Animes animes1 = new Animes();
		
		Otakus otakus = new Otakus();
		Otakus otakus1 = new Otakus();
		Otakus otakus2 = new Otakus();
		Otakus otakus3 = new Otakus();
		
		animes.setAnime_id(1);
		animes.setAnime_name("Death Note");
		
		animes1.setAnime_id(2);
		animes1.setAnime_name("Monster");
		
		otakus.setOtaku_id(1);
		otakus.setOtaku_name("Soham");
		otakus.getAnimes().add(animes);
		
		otakus1.setOtaku_id(2);
		otakus1.setOtaku_name("Meghna");
		otakus.getAnimes().add(animes);
		
		otakus2.setOtaku_id(3);
		otakus2.setOtaku_name("Aditya");
		otakus.getAnimes().add(animes1);
		
		otakus3.setOtaku_id(4);
		otakus3.setOtaku_name("Ivy");
		otakus.getAnimes().add(animes1);
		
		SessionFactory sessfact=new Configuration().configure().buildSessionFactory();
		Session session=sessfact.openSession();
		session.beginTransaction();
		session.save(animes);
		session.save(animes1);
		
		session.save(otakus);
		session.save(otakus1);
		session.save(otakus2);
		session.save(otakus3);
		session.getTransaction().commit();
	}

}
