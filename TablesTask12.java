package pl.krzysztofbujak;

public class TablesTask12 {

    //elementy w środku

    public static void main(String[] args) {

        TablesTask12 tablesTask12 = new TablesTask12();
        tablesTask12.middleEl(new int[]{1,43,43,876,7,1});

    }

    public int[] middleEl(int[] tab){

        int[] result = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (i==0 || i==tab.length-1){}
            else{
            System.out.println(tab[i]);}
        }

        return result;
    }

}
