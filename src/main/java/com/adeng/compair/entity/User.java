package com.adeng.compair.entity;

import java.lang.reflect.Field;

public class User {

	private String name;
	private String age;
	private String height;
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) return true;  
        if(obj instanceof User){  
        	  try {  
                  Boolean check = true;  
                  Field[] objectFields = obj.getClass().getDeclaredFields();  
                  Field[] PersonFields = obj.getClass().getDeclaredFields();  
                  for(int i = 0;i< objectFields.length;i++){  
                      if(!objectFields[i].get(obj).equals(PersonFields[i].get(this))){  
                          check = false;  
                          break;  
                      }  
                  }  
                  return check;  
              } catch (Exception e) {  
                  e.printStackTrace();  
              }  
              return true;  
        }
        return false;
	}
	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	
}
