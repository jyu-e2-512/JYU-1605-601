package cn.jyu.heatingfeesystem.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionFactory 
{
	/*
	 * static SqlSessionFactory sqlSessionFactory =null; static SqlSession session =
	 * null; //静态代码块，只执行一次，加载mybatis-config.xml文件，获取Session对象 static { InputStream
	 * inputStream; try { inputStream =
	 * Resources.getResourceAsStream("mybatis-config.xml"); sqlSessionFactory = new
	 * SqlSessionFactoryBuilder().build(inputStream); session =
	 * sqlSessionFactory.openSession(); } catch (IOException e) {
	 * e.printStackTrace(); }
	 * 
	 * } //获取Session对象 public static SqlSession getSession() { return session; }
	 */
}
