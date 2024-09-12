public class mainFile {
    public static void main(String[] args) {

        Dog dogObj = new Dog();
        Dog dogObj1 = new Dog();

        dogObj.set_Name("Chowlong");
        System.out.println("Dog's Name: " + dogObj.showName());

        dogObj1.set_Name("Diosdado");
        System.out.println("Dog's Name: " + dogObj1.showName());
        
        System.out.println(dogObj.is_Male = true);
        System.out.println(dogObj1.is_Male = true);


        dogObj.bark();
        dogObj1.bark();

        dogObj.list_of_Puppies = new String[] {"Bob", "Kazumi", "Xiaoyu", "Dragunov", "Gorlock the Destroyer"};
        dogObj1.list_of_Puppies = new String[] {"Asuka", "Lancelot", "Hylos", "Lolita", "Hanabi", "Layla"};

        System.out.println("Number of puppies for " + dogObj.showName() + ": " + dogObj.showNumberOfPuppy());
        System.out.println("Number of puppies for " + dogObj1.showName() + ": " + dogObj1.showNumberOfPuppy());
        
        dogObj.showList();
        dogObj1.showList();
    }
}
