package cn.myweb.service;

import cn.myweb.dao.CustomerDao;
import cn.myweb.entity.Customer;

public class CustomerService {
	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public Customer findOne(Integer cid) {
		
		return customerDao.findOne(cid);
	}
	
}
