package pl.krzysztofbujak;

public class NWDTask {

    //Największy wspólny dzielnik

    public static void main(String[] args) {

        NWDTask nwdTask = new NWDTask();

        System.out.println(nwdTask.NWD(100, 100));

    }

    public int NWD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

}
