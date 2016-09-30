package com.niit.homeshop.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.homeshop.modal.Admin;
import com.niit.homeshop.modal.CardPayment;
import com.niit.homeshop.modal.Cart;
import com.niit.homeshop.modal.Category;
import com.niit.homeshop.modal.Product;
import com.niit.homeshop.modal.ShippingAddress;
import com.niit.homeshop.modal.SubCategory;
import com.niit.homeshop.modal.Supplier;
import com.niit.homeshop.modal.UserAccount;
import com.niit.homeshop.service.UserAccountDAO;
import com.niit.homeshop.service.UserAccountDAOImpl;


@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class ApplicationContextConfig {
	
	@Autowired
	@Bean(name="datasource")
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/homeshop");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;	
	}
	private Properties getHibernateProperties() {
		Properties properties=new Properties();
		 properties.put("hibernate.show_sql","true");
		 properties.put("hibernate.hbm2ddl.auto","update");
		 properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		 properties.put("hibernate.format_sql","true");
		return properties;
	}
	
	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
		  sessionBuilder.addProperties(getHibernateProperties());
		  sessionBuilder.addAnnotatedClass(Admin.class);
		  sessionBuilder.addAnnotatedClass(UserAccount.class);
		  sessionBuilder.addAnnotatedClass(Cart.class);
		  sessionBuilder.addAnnotatedClass(Product.class);
		  sessionBuilder.addAnnotatedClass(Category.class);
		  sessionBuilder.addAnnotatedClass(SubCategory.class);
		  sessionBuilder.addAnnotatedClass(Supplier.class);
		  sessionBuilder.addAnnotatedClass(ShippingAddress.class);
		  sessionBuilder.addAnnotatedClass(CardPayment.class);
		  return sessionBuilder.buildSessionFactory();	  
		
	}
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transcationManager=new HibernateTransactionManager(sessionFactory);
		return transcationManager;
	}
	
    @Autowired(required=true)  
    @Bean(name="useraccountDAO")
    public UserAccountDAOImpl getUserAccountDAO(SessionFactory sessionFactory) {
	      return new UserAccountDAOImpl(sessionFactory);
    }
	
}

