
package metodusok;

public class osszeadasFuggvenyJobb {
    public static void main(String[] args) {
        int szam1 = 3;
        int szam2 = 6;
        int eredmeny = osszead(szam1, szam2);
        //System.out.printf("%d + %d = %d\n", szam1,szam2,szam1 + szam2);
        kettoSzamOsszegetKiir(szam1,szam2);
        
        int masikEredmeny = osszead(eredmeny, 2);
        kettoSzamOsszegetKiir(eredmeny,2);
    }
    static int osszead(int szam1, int szam2){
        return szam1 + szam2;
    }
    static void kettoSzamOsszegetKiir(int szam1, int szam2){
        System.out.printf("%d + %d = %d\n", szam1, szam2,osszead(szam2, szam2));
    }
   
   
}
