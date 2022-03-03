
package metodusok;

public class osszeadasFuggvenyLegjobb {
    
    static int szam1 = 3;
    static int szam2 = 6;
    
    public static void main(String[] args) {
//        int eredmeny = kettoSzamotOsszead();
//        kettoSzamOsszegetKiir();
//        
//        szam1 = eredmeny;
//        szam2 = 2;
//        int masikEredmeny = kettoSzamotOsszead();
//        kettoSzamOsszegetKiir();
//        
//        szam1 = 13;
//        szam2 = 4;
//        kettoSzamOsszegetKiir();
//        
        osszeadasFuggvenyLegjobb ofl = new osszeadasFuggvenyLegjobb();
        int masikEredmeny = ofl.kettoSzamotOsszead();
        ofl.kettoSzamOsszegetKiir();
        
//        szam1 = eredmeny;
//        szam2 = 2;
//        int masikEredmeny = kettoSzamotOsszead();
//        kettoSzamOsszegetKiir();
//        
//        szam1 = 13;
//        szam2 = 4;
//        kettoSzamOsszegetKiir();
    }
    int kettoSzamotOsszead(){
        return szam1 + szam2;
    }
    void kettoSzamOsszegetKiir(){
        System.out.printf("%d + %d = %d\n", szam1, szam2,kettoSzamotOsszead());
    }
   
   
}
