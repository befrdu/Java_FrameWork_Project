package com.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.asd.domain.AccountFactory;
import com.asd.domain.CheckingAccount;
import com.asd.domain.Company;
import com.asd.domain.Customer;
import com.asd.domain.DebitAccountFactory;
import com.asd.repository.AccountDAO;
import com.asd.repository.AccountDAOImpl;
import com.asd.service.AccountService;
import com.asd.service.AccountServiceImpl;
import com.asd.service.BalanceChangeObserver;
import com.asd.service.EmailSender;

public class Apptest {

	AccountService accountService = null;

	@Before
	public void befor() {
		AccountFactory accountFactory = new DebitAccountFactory();
		AccountDAO accountDao = new AccountDAOImpl();
		AccountService accountService = new AccountServiceImpl(accountDao, accountFactory);

		BalanceChangeObserver observer = new EmailSender();
		accountService.addBalanceChangeObserver(observer);

	}

	@Test
	public final void testDeposit() {
		AccountFactory accountFactory = new DebitAccountFactory();
		AccountDAO accountDao = new AccountDAOImpl();
		AccountService accountService = new AccountServiceImpl(accountDao, accountFactory);

		BalanceChangeObserver observer = new EmailSender();
		accountService.addBalanceChangeObserver(observer);

		if (accountService != null) {
			System.out.println("Not Null");
		} 
		
		Customer customer = new Company();
		customer.setAddress(null);
		customer.setName("customer");		
		accountService.createAccount(customer, "CHECKING", "012-120-147", 100.0);

		accountService.deposit("012-120-147", 100.0);
		System.out.println(accountService.getAllAccounts());
	}

	@Test
	public final void testWithdraw() {
	}

}
