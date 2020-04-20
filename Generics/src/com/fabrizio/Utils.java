package com.fabrizio;

public class Utils {
    public static <T extends Comparable> T max(T first, T second){
        return (first.compareTo(second) < 0) ? second : first;
    }
    public static void printUser(User user) {
        System.out.println(user);
    }

    // class cap# 1  extends User{}
    //
    public static void printUsers
    (GenericList<? super User> users) {
    GenericList<user> temp = new GenericList<>();
    User x = users.get(0);
    users.add(new User(1));
    }
}
