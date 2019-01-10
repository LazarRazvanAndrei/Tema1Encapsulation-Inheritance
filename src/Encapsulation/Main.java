package Encapsulation;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("LA","Lazar","Andrei");
        User user2 = new User("LR","Lazar","Razvan");

        System.out.println(user1);
        System.out.println(user2);

        System.out.println(" Baza de date persoane: " + "\n" + user1.getUsername() + " "+ user1.getFirstName() + " " + user1.getLastName() + "\n" +
                user2.getUsername() + " "+ user2.getFirstName() + " " + user2.getLastName());
        System.out.println(" Baza de date persoane: " + "\n" + user2.getUsername() + " "+ user2.getFirstName() + " " + user2.getLastName());



        //1.e
//        public String generateDisplayName() {
//            return this.firstName + ' ' + this.lastName;
//        }System.out.println();
    }


}
