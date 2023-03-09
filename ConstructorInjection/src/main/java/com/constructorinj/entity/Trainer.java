package com.constructorinj.entity;

public class Trainer {
	private Subject subject;

	public Trainer() {
		super();
		
	}

	public Trainer(Subject subject) {
		super();
		this.subject = subject;
	}

	
	
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Trainer [subject=" + subject + "]";
	}
	
	public void teach ()
	{
		System.out.println("Trainer is Teaching "+ subject.getName());
	}

}



