package com.raystech.thread;

public class Account extends Thread{
	private int balance = 0;

	public synchronized void deposite(String name, int amt) {
		int bal = getBalance() + amt;
		setBalance(bal);
		System.out.println(name + " " + "new balance" + bal);
	}

	public int getBalance() {
		DatabaseDelay();
		return balance;
		
	}

	public void setBalance(int balance) {
		DatabaseDelay();
		this.balance = balance;
	}
	

	public void DatabaseDelay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		
	}
}
