public class Main {
    public static void main(String[] args) {
        Student scott=new Student("Scott",1);
        Student arne=new Student("Arne",2);
        Student david= new Student("David",4);

        Student hanne= new Student("Hanne",1);
        Student dante= new Student("Dante",0);

        Student[] studenter={scott,arne,david,hanne};

        Oppgaveoversikt oversikt=new Oppgaveoversikt(studenter, studenter.length);

        System.out.println(oversikt);

        oversikt.okAntOpgForStud(scott);

        oversikt.regNyStud(dante);

        System.out.println(oversikt);

    }
}