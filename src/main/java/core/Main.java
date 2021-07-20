package core;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection DC = new DatabaseConnection();
        System.out.println(DC.Open());
    }
}
