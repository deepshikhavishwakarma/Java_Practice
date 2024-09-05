package CodePractice.Codeday24_Inheritance.ZooManagement;

public class Animal {

        private String name;
        private int age;

        Animal(String name,int age){
            this.name = name;
            this.age = age;
        }
        public void makeSound(){
            System.out.println("The animal makes a generic sound.");
        }
        public void displayInfo(){
            System.out.println("Name  "+name+"\nAge   "+age);
        }
    }
