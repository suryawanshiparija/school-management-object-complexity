package org.dnyayog;

public class SchoolMain {
	
	    public static void main(String[] args) {
	        Student std = new Student();

	        std.setFirstName("Parija");
	        std.setLastName("Suryawanshi");
	        std.setEmail("sp@gmail.com");
	        std.setMobile("745982555");

	        Address address = new Address();
	        address.setStreet1("Swami Raghavendra Colony");
	        address.setStreet2("old Ausa Road");
	        address.setCity("Latur");
	        address.setState("Maharashtra");
	        address.setCountry("India");
	        std.setAddress(address);

	        System.out.println(std);
	    }
	}



