
package metodusok;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        cim("BMI index kiszámítása");
        int tomeg = beker("Testtömeg (kg) [40; 150]:", 40, 150);
        int magassag = beker("Testmagasság (cm) [100; 200]:", 100, 200);
        double bmiIndex = bmi(tomeg, magassag);
//        ertekeles(tomeg,magassag, bmiIndex);
    }

    static void cim(String szoveg) {
        System.out.println(szoveg);
    }

    static int beker(String kerdes, int tomeg, int magassag) {
        System.out.print(kerdes);
        
        Scanner sc = new Scanner(System.in);
        int szam = -1;
        boolean jo = false;
        while(!jo){
        szam = sc.nextInt();
        jo = szam >= 100 && szam <= 200;
            if (!jo) {
                System.out.println("Nem jó, újra");
                System.out.print(kerdes);
            }
        }
        
        return szam;
    }

    static double bmi(int tomeg, int magassag) {
        return tomeg / Math.pow(magassag / 100.0,2);
    }

    static void ertekeles() {
        System.out.printf("Ön %d");
    }

}
