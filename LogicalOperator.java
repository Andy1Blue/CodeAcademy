package pl.krzysztofbujak;

public class LogicalOperator {

    public static void main(String[] args) {

        //operators: > < >= <+ == != !

        int age = 23;
        int dayOfWeek = 4;

        if (age >= 18 && dayOfWeek == 5) {
            System.out.println("Jesteś pełnoletni!");
        } else if (age == 17) {
            System.out.println("Prawie...");
        } else {
            System.out.println("Nie jesteś pełnoletni!");
        }

        //----------

        String msg = age >= 18 ? "Pełnoletność" : "Małolat";
        System.out.println(msg);

        //----------

        switch (age) {
            case 23:
                System.out.println("Masz 23");
                break;
            case 24:
                System.out.println("Masz 24");
                break;
            default:
                System.out.println("Nie masz tyle lat ile chcę");
                break;
        }

    }

}
