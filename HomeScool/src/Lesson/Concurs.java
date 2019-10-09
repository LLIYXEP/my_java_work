package Lesson;

public class Concurs {
	
	// класс человека
    static class Person {
         
        private String name;
         
        public String getName() { return name; }
        
        public Person(String name){
         
            this.name=name;
        }
      
        public void display(){
             
            System.out.printf("Person %s \n", name);
        }
    }
    // служащий некоторой компании 
    static class Employee extends Person{
     
        private String company;
         
        public Employee(String name, String company) {
         
            super(name);
            this.company = company;
        }
        public String getCompany(){ return company; }
         
        public void display(){
             
            System.out.printf("Employee %s works in %s \n", super.getName(), company);
        }
    }
    // класс клиента банка
    static class Client extends Person{
           
        private int sum; // Переменная для хранения суммы на счете
        private String bank;
           
        public Client(String name, String bank, int sum) {
           
            super(name);
            this.bank=bank;
            this.sum=sum;
        }
           
        public void display(){
               
            System.out.printf("Client %s has account in %s \n", super.getName(), bank);
        }
           
        public String getBank(){ return bank; }
        public int getSum(){ return sum; }

}
	
	public static void main(String[] args) {
		Object tom = new Person("Tom");
		Object sam = new Employee("Sam", "Oracle");
		Object kate = new Client("Kate", "DeutscheBank", 2000);
		Person bob = new Client("Bob", "DeutscheBank", 3000);
		bob.display();
		Person alice = new Employee("Alice", "Google");
		alice.display();
		
		System.out.println();
		
		Object sam2 = new Employee("Sam2", "Oracle");
        
		// нисходящее преобразование от Object к типу Employee
		Employee emp = (Employee)sam2;
		emp.display();
		System.out.println(emp.getCompany());
		
		Object kate2 = new Client("Kate2", "DeutscheBank", 2000);
		((Person)kate2).display();
		         
		Object sam3 = new Employee("Sam3", "Oracle");
		((Employee)sam3).display();
		
		System.out.println();
		
		Object kate3 = new Client("Kate", "DeutscheBank", 2000);
		Employee emp2 = (Employee) kate3;
		emp2.display();
		         
		// или так
		((Employee)kate3).display();
	}
    
}
 

