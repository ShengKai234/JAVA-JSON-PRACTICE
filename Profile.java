package org.iii.test;

public class Profile {

	private String name;
	private int age;
	private String live;
	
	//初始化
	public Profile(String name, int age, String live) {
		this.name = name;
		this.age = age;
		this.live = live;
	}

	//get、set functions----------------------------------
	//function中get及set後的名稱第一個字母大寫，配合套件
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return this.age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}

	public String getLive()
	{
		return this.live;
	}
	
	public void setLive(String live)
	{
		this.live = live;
	}
	//---------------------------------------------------------
	
	public void setProfile(String name, int age, String live)
	{
		setName(name);
		setAge(age);
		setLive(live);
	}
	
	
	
	
	
	

}
