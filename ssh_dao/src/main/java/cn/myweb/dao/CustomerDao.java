package cn.myweb.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.myweb.entity.Customer;

public class CustomerDao extends HibernateDaoSupport {

	public Customer findOne(Integer cid) {
		
		return this.getHibernateTemplate().get(Customer.class, cid);
	}
	
}
