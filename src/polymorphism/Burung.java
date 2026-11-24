package polymorphism;

public class Burung extends Binatang {
    @Override 
    protected void bergerak() {
        System.out.println("Burung bergerak sedang terbang.");
    }
    
}
