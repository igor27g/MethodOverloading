public class Main {

    public static void main(String[] args) {
       howManyGoals("Lewandowski", 10);
       howManyGoals("Robben");
       howManyGoals();
    }

    public static int howManyGoals(String playerName, int goals) {
        System.out.println("The " + playerName + " scored " + goals + " goals.");
        return goals;
    }

    public static void howManyGoals(String playerName) {
        System.out.println("We don't know how many goals scored " + playerName + ".");
    }

    public static void howManyGoals() {
        System.out.println("We know nothing.");
    }


}
