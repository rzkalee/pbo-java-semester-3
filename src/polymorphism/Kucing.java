package polymorphism;

public class Kucing extends Binatang {
    @Override 
    protected void bergerak() {
        System.out.println("Kucing bergerak sedang berjalan.");
    }
}
