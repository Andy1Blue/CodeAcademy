package pl.krzysztofbujak;

public class TablesTask11 {
    //posortowsana tablica

    public static void main(String[] args) {

        TablesTask11 tablesTask11 = new TablesTask11();
        System.out.println(tablesTask11.sortBubble(new int[]{4, 32, 5, 1, 2}));

    }

    public int[] sortBubble(int[] tab) {
        int temp;
        int zm = 1;

        while (zm > 0) {

            for (int i = 0; i < tab.length - 1; i++) {
                //jeśli drugi elem jest większy od pierwszego
                if(tab[i]>tab[i+1]){
                    // to drugi el wrzuca,m do temp
                    temp = tab[i+1];
                    // drugi el przestawiam na pierwsz pozycje
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    zm++;
                }
            }
        }
            for (int i = 0; i < tab.length; i++) {
                System.out.println(tab[i]);
        }
        return tab;
    }

}
