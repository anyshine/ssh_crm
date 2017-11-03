package cn.myweb.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.myweb.entity.Customer;
import cn.myweb.service.CustomerService;

public class CustomerAction extends ActionSupport {
	private CustomerService customerService;
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public String save() {
		System.out.println("action save");
		return SUCCESS;
	}
	
	private Integer cid;

	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String findOne() throws Exception {
		Customer customer = customerService.findOne(cid);
		ActionContext.getContext().getValueStack().push(customer);
		return SUCCESS;
	}
}
