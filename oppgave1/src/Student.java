public class Student {
    private String navn;
    private int antOpg;//antall oppgaver som har blitt godkjent

    public Student(String navn,int antOpg){
        this.navn=navn;
        this.antOpg=antOpg;
    }

    public String getNavn(){
        return navn;
    }

    public int getAntOpg(){
        return antOpg;
    }

    public void increaseAntOpg(int okning){
        antOpg+=okning;
    }

    public String toString(){
        return getNavn()+" har fått "+getAntOpg()+" oppgave(r) godkjent";
    }
}
