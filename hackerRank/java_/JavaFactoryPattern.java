package java_;

import java.security.Permission;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-factory/problem
public class JavaFactoryPattern {
    public static void main(String args[]){
        Do_Not_Terminate.forbidExit();
        try {
            Scanner sc=new Scanner(System.in);
            FoodFactory foodFactory = new FoodFactory();    //creating the factory
            Food food = foodFactory.getFood(sc.nextLine()); //factory instantiates an object

            System.out.println("The factory returned "+food.getClass());
            System.out.println(food.getType());
        }
        catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

interface Food {
    public String getType();
}
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        return order.equals("cake") ? new Cake() : new Pizza();
    }
}

class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
