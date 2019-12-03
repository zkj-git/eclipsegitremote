package edu.ncu.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import edu.ncu.entity.User;

public class HibernateDemo {

	@Test
	public void testAdd() {
//		��һ�� ����hibernate���������ļ�
		// ��src�����ҵ�������hibernate.cfg.xml
		//��hibernate�����װ����
		Configuration cfg = new Configuration();
		cfg.configure();
//		�ڶ��� ����SessionFactory����
		//��ȡhibernate���������ļ����ݣ�����sessionFactory
		//�ڹ����У�����ӳ���ϵ�����������ݿ�����ѱ���
		SessionFactory sessionFactory = cfg.buildSessionFactory();
//		������ ʹ��SessionFactory����session����
		// ����������
		Session session = sessionFactory.openSession();
//		���Ĳ� ��������
		Transaction tx = session.beginTransaction();
//		���岽 д�����߼� crud����
		//��ӹ���
		User user = new User();
		user.setUsername("С��11");
		user.setPassword("520111231");
		user.setAddress("����111");
		//����session�ķ���ʵ�����
		session.save(user);
//		������ �ύ����
		tx.commit();
//		���߲� �ر���Դ
		session.close();
		sessionFactory.close();
	}
}
