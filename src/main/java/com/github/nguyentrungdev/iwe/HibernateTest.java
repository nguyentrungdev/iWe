package com.github.nguyentrungdev.iwe;

import org.hibernate.Session;

import com.github.nguyentrungdev.iwe.pojo.User;
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
		session.getTransaction().commit();
		System.out.println("done");
	}

}
