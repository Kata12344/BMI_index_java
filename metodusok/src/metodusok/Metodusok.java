
package metodusok;

public class Metodusok {
    private static void másvalami(){
        System.out.println("Csivava");
    }
    private static void valami(){
        System.out.println("Valamit csinálok");
        másvalami();
    }

    public static void main(String[] args) {
        valami();
    }
    
}
