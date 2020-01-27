

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;


public class UserDAO 
{
public static boolean signup(Userbean p){
	//System.out.println(p.getFirstName());
	Query q= new Query("UserDt");
	int temp1=0;
	DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	PreparedQuery pq= ds.prepare(q);
	//System.out.println(uid);
	
	String uid=p.getMailid();
	String num=p.getMobilenumber();
	for(Entity UserDt:pq.asIterable())
	{
		String uid1=String.valueOf(UserDt.getProperty("Mail_id"));
		String mob1=String.valueOf(UserDt.getProperty("Phone_number"));
		if(uid.equals(uid1) || num.equals(mob1) )
		{
			temp1=1;
			break;
		}
	}
	if(temp1==0) {
		Entity obj=new Entity("UserDt");
		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		
		obj.setProperty("First_name",(String)p.getFirstName());
		obj.setProperty("Last_name",p.getLastname());
		obj.setProperty("Phone_number",p.getMobilenumber());
		obj.setProperty("Mail_id",p.getMailid());
		obj.setProperty("Passcode",p.getPassword());
		
		datastore.put(obj);
		
	}
	if(temp1!=0)
	{
		return false;
	}
	else
	{
		return true;
	}
	
	


}
public static boolean login(Userbean p)
{
	Query q= new Query("UserDt");
	int temp=0;
	DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	PreparedQuery pq= ds.prepare(q);
	//System.out.println(uid);
	
	String uid=p.getMailid();
	String pass=p.getPassword();
	for(Entity UserDt:pq.asIterable())
	{
		String uid1=String.valueOf(UserDt.getProperty("Mail_id"));
		
		if(uid.equals(uid1))
		{
			//System.out.println(uid1);
			String pass1=String.valueOf(UserDt.getProperty("Passcode"));
			if(pass.equals(pass1))
			{	 
				p.setFirstname(String.valueOf(UserDt.getProperty("First_name")));
				p.setLastName(String.valueOf(UserDt.getProperty("Last_name")));

				temp=1;
			
				break;
				
			   
		
			}
		}
}
	
if(temp==0)
{
	return false;
}
else
{
	return true;
}
	
	


}
}
