package CodePractice.Codeday24_Inheritance.ZooManagement;

public class ZooManagement {
    public static void main(String[] args) {

        Lion l1 = new Lion("Simba", 8, 20);
        Elephant e1 = new Elephant("Jambo", 8, 20.4f);
        System.out.println("Lion Details ");
        l1.displayInfo();
        l1.makeSound();
        l1.displayManeLength();
        System.out.println();
        System.out.println("Elephant Details");
        e1.displayInfo();
        e1.makeSound();
        e1.displayTuskLength();


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter name");
//        String name = sc.next();
//        System.out.println("Enter age");
//        int age = sc.nextInt();
//
//
//        if(age>=0){
//            System.out.println("Enter maneLength");
//            int maneLength = sc.nextInt();
//            System.out.println("Enter tuskLength");
//            float tuskLength = sc.nextFloat();
//            if( maneLength>0) {
//                Lion l1 = new Lion(name, age, maneLength);
//                l1.displayInfo();
//                l1.makeSound();
//            }else if(tuskLength >0) {
//
//                Elephant e1 = new Elephant(name, age, tuskLength);
//                e1.displayInfo();
//                e1.makeSound();
//            }else{
//                System.out.println("Error Invalid Input");
//            }
//        }else{
//            System.out.println("Error Invalid Input");
//        }

    }
}

