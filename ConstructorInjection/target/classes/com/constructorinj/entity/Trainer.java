package const.inject.entiry2;

import const.inject.entity1.Subject;

public class Trainer 
{
	private Subject subject;
	
	public Trainer(Subject subject)
	{
		this.subject = subject;
	}
	
public String teach()
{
	return "<body bgcolor='teal' text='white'>"
				+ "<center><h1>Ricky is taken a Training"+subject.getSub_Name()+" with Aron</h1></center>"
		+ "</body>";
}
}
