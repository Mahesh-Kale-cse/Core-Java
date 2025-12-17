package Inheritance;

//Demonstrating constructor chaining in inheritance hierarchy

class Grandpa {
 String surname;

 // Grandpa constructor
 Grandpa(String surname) {
     this.surname = surname;
     System.out.println("Grandpa constructor called");
 }

 void displaySurname() {
     System.out.println("Surname: " + surname);
 }
}

class Father extends Grandpa {
 String job;

 // Father constructor calls Grandpa constructor
 Father(String surname, String job) {
     super(surname); // calls Grandpa constructor
     this.job = job;
     System.out.println("Father constructor called");
 }

 void showJob() {
     System.out.println("Job: " + job);
 }
}

class Uncle extends Grandpa {
 String farm;

 // Uncle constructor calls Grandpa constructor
 Uncle(String surname, String farm) {
     super(surname);
     this.farm = farm;
     System.out.println("Uncle constructor called");
 }

 void showFarm() {
     System.out.println("Farm: " + farm);
 }
}

class Pratham extends Father {
 String friend;

 // Pratham constructor calls Father constructor
 Pratham(String surname, String job, String friend) {
     super(surname, job);
     this.friend = friend;
     System.out.println("Pratham constructor called");
 }

 void showFriend() {
     System.out.println("Friend: " + friend);
 }
}

class Pratiksha extends Father {
 String degree;

 // Pratiksha constructor calls Father constructor
 Pratiksha(String surname, String job, String degree) {
     super(surname, job);
     this.degree = degree;
     System.out.println("Pratiksha constructor called");
 }

 void showDegree() {
     System.out.println("Degree: " + degree);
 }
}

class Pankaj extends Uncle {
 String business;

 // Pankaj constructor calls Uncle constructor
 Pankaj(String surname, String farm, String business) {
     super(surname, farm);
     this.business = business;
     System.out.println("Pankaj constructor called");
 }

 void showBusiness() {
     System.out.println("Business: " + business);
 }
}

public class ConstructorChaning {
 public static void main(String[] args) {

     System.out.println("\n--- Pratham's Details ---");
     Pratham pratham = new Pratham("Patil", "Engineer", "Mahadev");
     pratham.displaySurname();
     pratham.showJob();
     pratham.showFriend();

     System.out.println("\n--- Pratiksha's Details ---");
     Pratiksha pratiksha = new Pratiksha("Patil", "Doctor", "MSc");
     pratiksha.displaySurname();
     pratiksha.showJob();
     pratiksha.showDegree();

     System.out.println("\n--- Pankaj's Details ---");
     Pankaj pankaj = new Pankaj("Patil", "Green Valley Farm", "Dairy");
     pankaj.displaySurname();
     pankaj.showFarm();
     pankaj.showBusiness();
 }
}
