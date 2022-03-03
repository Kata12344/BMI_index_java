
package metodusok;

public class osszeadasFuggvenyMajdnemLegjobb {
    
    static int szam1 = 3;
    static int szam2 = 6;
    
    public static void main(String[] args) {
//        int szam1 = 3;
//        int szam2 = 6;
        int eredmeny = kettoSzamotOsszead();
        kettoSzamOsszegetKiir();
        
        
        szam1 = eredmeny;
        szam2 = 2;
        int masikEredmeny = kettoSzamotOsszead();
        kettoSzamOsszegetKiir();
        
        szam1 = 13;
        szam2 = 4;
        kettoSzamOsszegetKiir();
    }
    static int kettoSzamotOsszead(){
        return szam1 + szam2;
    }
    static void kettoSzamOsszegetKiir(){
        System.out.printf("%d + %d = %d\n", szam1, szam2,kettoSzamotOsszead());
    }
   
   
}
