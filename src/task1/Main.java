package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "vasya", Gender.MALE);
        User user2 = new User(2, "alla", Gender.FEMALE);
        User user3 = new User(3, "ann", Gender.FEMALE);
        User user4 = new User(4, "kolya", Gender.MALE);
        User user5 = new User(5, "andrew", Gender.MALE);
        User user6 = new User(6, "sasha", Gender.FEMALE);
        User user7 = new User(7, "kris", Gender.MALE);
        User user8 = new User(8, "bodya", Gender.MALE);
        User user9 = new User(9, "olena", Gender.FEMALE);
        User user10 = new User(10, "yulia", Gender.FEMALE);

        ArrayList <User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        //System.out.println(users);

//        for (int i = 0; i < users.size(); i++) {
//            if(users.get(i).getId()%2 == 0) {
//                System.out.print(users.get(i));
//            }
//
//        }
//        for (int i = 0; i < users.size(); i++) {
//            if(users.get(i).getName().length() > 5) {
//                System.out.print(users.get(i));
//            }
//
//        }
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getGender() == Gender.FEMALE) {
                System.out.print(users.get(i));
            }

        }

    }
}
