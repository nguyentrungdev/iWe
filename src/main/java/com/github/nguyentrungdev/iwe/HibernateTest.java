package com.github.nguyentrungdev.iwe;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;

import com.github.nguyentrungdev.iwe.pojo.Person;
import com.github.nguyentrungdev.iwe.pojo.WallPost;
import com.github.nguyentrungdev.iwe.pojo.WallPost_Like;
import com.github.nguyentrungdev.iwe.util.HibernateUtil;

public class HibernateTest {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		//EntityManagerFactory emf = HibernateUtil.getEntityMangerFactory();
		//EntityManager em = emf.createEntityManager();
		//Person userT = em.find(Person.class, "3");
		//System.out.println(userT.getFirstName());
		Person person = new Person();
		person.setFirstName("Trung");
		person.setUserName("trung");
		person.setPassWord("123456");
		person.setIsActive(true);
		session.save(person);
		System.out.println(person.getId());
		WallPost post = new WallPost();
		post.setContent("TrungTest");
		post.setIsActive(true);
		post.setCreatedDate(new Date());
		post.setUser_Id(person.getId());
		
		session.save(post);
		WallPost_Like like = new WallPost_Like();
		like.setUser_Id(person.getId());
		like.setWallPost_Id(post.getId());
		session.save(like);
		session.getTransaction().commit();
		System.out.println("done");
	}

}
