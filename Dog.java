class Dog {
    String name;
    boolean is_Male;
    int num_of_Puppies;
    String[] list_of_Puppies;

   

   public void set_Name(String Name){
         name = Name;
    }
    public String showName(){
        return name;
    }

    public void bark(){
        System.out.println("Woof! Woof!");
    }

    public int showNumberOfPuppy() {
        if (list_of_Puppies != null) {
            return list_of_Puppies.length;
        } else {
            return 0;
        }
    }

    public void showList(){
        for (int i = 0; i < list_of_Puppies.length; i++) {
            System.out.println(list_of_Puppies[i]);
        }
    }


}
