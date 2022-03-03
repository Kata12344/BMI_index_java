
package progtetelek;

import java.util.Random;

public class PrimSzamMetodussal {
    public static void main(String[] args) {
        int szam = 9;
        boolean prim = primszam(szam);
        
        
//        boolean vanOsztoja = i < szam-1;
//        boolean nincsOsztoja = i >= szam-1;
//        boolean nemPrim = i < szam-1;
//        Random rnd = new Random();
//        int sz = rnd.nextInt();
        int[] sorozat = {10001, 2, 1, 10007, new Random().nextInt() };
        sorozatotKiír(sorozat);
        
//        progtételek
//        megszámlálás
        int N = sorozat.length;
        int dbPrim = 0;
        for (int i = 0; i < N; i++) {
            if (primszam(sorozat[i])) {
                dbPrim++;
            }
        }
        
//        eldöntés I.
        int i = 0;
        while(i< N && !(primszam(sorozat[i]))){
            i++;
        }
        boolean vanBennePrim = i< N;
//        boolean nincsBennePrim = i >= N;
        
//        eldöntés II.
        i = 0;
        while(i< N && (primszam(sorozat[i]))){
            i++;
        }
        boolean mindenElemPrim = i >= N;
        
//        lin keresés
        i = 0;
        while(i< N && !(primszam(sorozat[i]))){
            i++;
        }
        vanBennePrim = i< N;
        if (vanBennePrim) {
            System.out.println("");
        }else{
            System.out.println("");
        }
    }
    static boolean primszam(int szam){
        if (szam < 2) {
//            prim = false;
            return false;
        }else{
            int i = 2;
            while(i <= Math.sqrt(szam) && !(szam % i == 0)){
                i++;
            }
             return i > Math.sqrt(szam);
            }
//        System.out.printf("%d az prim: %b\n", szam, prim);
    }

    private static void sorozatotKiír(int[] sorozat) {
        for (int i = 0; i < sorozat.length; i++) {
            System.out.print(sorozat[i] + " ");
            
        }
    }
}
