
public class Puppy {

	private String name;
	private String breed;
	private int age;
	private String vet;
	
	public Puppy() {
		
		name = " ";
		breed = " ";
		age = 0;
		vet = " ";
	}
	 
	
	public Puppy(String n, String b, int a, String v) {
		
		name = n;
		breed = b;
		age = a;
		vet = v;
	}
	
	
	public void setName(String nm) {
		
		name = nm;
	}

	
	public void setBreed(String b) {
		
		breed = b;
	}
	
	public void setAge(int a) {
		
		age = a;
		
	}
	
	
	public void setVet(String v) {
		
		vet = v;
		
	}
	
	

	 public String getName() 
	    {
	      return name;
	    }

	    public String getBreed() 
	    {
	      return breed;
	    }

	    public int getAge() 
	    {
	      return age;
	    }

	    public String getVet() 
	    {
	      return vet;
	    }


	    // OTHER METHODS
	    public int ageInDogYears() 
	    {
	      int dogYrs;
	      dogYrs = age * 7;
	      return dogYrs;
	    }

	    public String toString() 
	    {
	    // Returns a string representation of puppy’s name,
	    // breed, age and vet’s name.
	      String str;
	      str = 	"Name .....:   " + name + "\n" + 
	    		  	"Breed .....:  " + breed + "\n" + 
	    		  	"Age .....:    " + age + "\n" + 
	    		  	"Vet .....:    " + vet + "\n" + 
	    		  	"Age (in dog years) :" + ageInDogYears();
	      return str;
	    }

	
} 
