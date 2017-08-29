package practice11;

public class Person {
	private String firstName;
	   private String lastName;
	   private int age;

	   public Person (String newFirstName, String newLastName, int newAge)
	   {
		   
	      firstName = newFirstName;
	      lastName = newLastName;
	      age = newAge;
	   }
	   
	   public String getFirstName() 
	   {
	       return firstName;
	   }
	   
	   public String getLastName() 
	   {
	       return lastName;
	   }
	   
	   public int getAge() 
	   {
	       return age;
	   }
	   public boolean equals(Object o){
		   Person a1 = (Person) o;
		   
		   if(a1.firstName.compareTo(firstName)==0 && a1.lastName.compareTo(lastName)==0 && a1.getAge()==age)
			   return true;
		   else
			   return false;
		   
		   
	   }
}
