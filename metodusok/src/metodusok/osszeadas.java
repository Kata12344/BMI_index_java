
package metodusok;

public class osszeadas {
    public static void main(String[] args) {
        int szam1 = 3;
        int szam2 = 6;
        int eredmeny = osszead(szam1, szam2);
        //System.out.printf("%d + %d = %d\n", szam1,szam2,szam1 + szam2);
        kettoSzamOsszegetKiir(szam1,szam2,eredmeny);
        
        int masikEredmeny = osszead(eredmeny, 2);
        kettoSzamOsszegetKiir(eredmeny,2,masikEredmeny);
    }
    static int osszead(int a, int b){
        return a + b;
    }
    static void kettoSzamOsszegetKiir(int szam1, int szam2, int eredmeny){
        System.out.printf("%d + %d = %d\n", szam1, szam2,eredmeny);
    }
   
   
}
