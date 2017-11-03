package cn.myweb.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.myweb.dao.CustomerDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext-*.xml")
public class CustomerServiceTest {

	@Autowired
	private CustomerService customerService;
	
	@Test
	public void testFindOne() {
		customerService.findOne(1);
	}

}
