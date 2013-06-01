package com.logic;

import android.R.string;

public class Order {
	private int id;
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	private string adress;
	public void setAdress(string adress){
		this.adress = adress;
	}
	public string getAdress(){
		return adress;
	}
	
	private string clientName;
	public void setClientName(string clientName){
		this.clientName = clientName;
	}
	public string getClientName(){
		return clientName;
	}
	
	private string clientPhone;
	public void setClientPhone(string clientPhone){
		this.clientPhone = clientPhone;
	}
	public string getClientPhone(){
		return clientPhone;
	}
}
