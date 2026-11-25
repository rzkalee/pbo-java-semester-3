package stack;

public class Tumpukan {
    protected int MAKSADATA = 5;
    protected String[] tumpukan = new String[MAKSADATA];
    protected int puncak;

    public Tumpukan() {
        puncak = -1;
    }

    public void push(String data) {
        if (puncak == (MAKSADATA - 1)) {
            System.out.println("Keterangan : Tumpukan penuh");
            System.out.println(data + " tidak dapat dimasukan.");
        } else {
            puncak++;
            tumpukan[puncak] = data;
        }
    }

    public boolean empty() {
        return (puncak == -1);
    }

    public String pop() {
        if (!empty()) {
            return tumpukan[puncak--];
        } else {
            return "error";
        }
    }
}
