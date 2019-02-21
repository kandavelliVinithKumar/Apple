package Basics;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private int roll;
	private double fees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
}
