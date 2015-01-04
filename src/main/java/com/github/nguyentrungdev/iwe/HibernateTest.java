package com.github.nguyentrungdev.iwe;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;

import com.github.nguyentrungdev.iwe.pojo.User;
import com.github.nguyentrungdev.iwe.pojo.WallPost;
import com.github.nguyentrungdev.iwe.pojo.WallPost_Like;
import com.github.nguyentrungdev.iwe.util.HibernateUtil;

public class HibernateTest {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		//EntityManagerFactory emf = HibernateUtil.getEntityMangerFactory();
		//EntityManager em = emf.createEntityManager();
		//User userT = em.find(User.class, "3");
		//System.out.println(userT.getFirstName());
		User user = new User();
		user.setFirstName("Trung");
		user.setUserName("trung");
		user.setPassWord("123456");
		user.setIsActive(true);
		session.save(user);
		System.out.println(user.getId());
		WallPost post = new WallPost();
		post.setContent("TrungTest");
		post.setIsActive(true);
		post.setCreatedDate(new Date());
		post.setUser_Id(user.getId());
		
		session.save(post);
		WallPost_Like like = new WallPost_Like();
		like.setUser_Id(user.getId());
		like.setWallPost_Id(post.getId());
		session.save(like);
		session.getTransaction().commit();
		System.out.println("done");
	}

}
