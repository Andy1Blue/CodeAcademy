package pl.krzysztofbujak;

public class MethodsTask16 {

    //Napisz metodę, która sprawdza czy wyraz jest peselem.
    //Dla uproszczeniasprawdzamy czy każdy znak jest cyfrą
    //i czy wyraz ma 11 znaków.

    public static void main(String[] args) {

        MethodsTask16 methodsTask16 = new MethodsTask16();
        methodsTask16.checkPesel("8012125435A");

    }

    public boolean checkPesel(String pesel) {
        char[] c = pesel.toCharArray();//"432" -> |4|3|2|
        int counter = 0;
        for (int i = 0; i < pesel.length(); i++) {
            if (pesel.length() == 11) {
                if (Character.isDigit(c[i])) {
                    System.out.println(c[i] + " is digit");
                } else {
                    System.out.println(c[i] + " is NOT digit");
                    counter++;
                }
            }
            if (counter > 0) {
                return false;
            }

        }
        return true;
    }

}
