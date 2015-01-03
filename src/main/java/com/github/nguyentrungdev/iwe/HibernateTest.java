package com.github.nguyentrungdev.iwe;

import java.util.Date;

import org.hibernate.Session;

import com.github.nguyentrungdev.iwe.pojo.User;
import com.github.nguyentrungdev.iwe.pojo.WallPost;
import com.github.nguyentrungdev.iwe.util.HibernateUtil;

public class HibernateTest {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
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
		session.getTransaction().commit();
		System.out.println("done");
		
	}

}
