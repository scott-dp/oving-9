public class Oppgaveoversikt {
    private Student[] studenter;
    private int antStud=0;

    public Oppgaveoversikt(Student[] studenter,int antStud){
        this.antStud=antStud;
        this.studenter=studenter;
    }

    public int getAntallStud(){
        return antStud;
    }

    public int oppgaverLost(Student stud){
        return stud.getAntOpg();
    }

    public void regNyStud(Student stud){
        Student[] nyStudenter=new Student[antStud+1];

        System.arraycopy(studenter, 0, nyStudenter, 0, studenter.length);

        nyStudenter[nyStudenter.length-1]=stud;
        studenter=nyStudenter;
        antStud++;
    }
    public void okAntOpgForStud(Student stud){
        stud.increaseAntOpg(1);
    }

    public String toString(){
        String returVerdi="";

        for (int i = 0; i < studenter.length; i++) {
            returVerdi+="Studenten "+studenter[i].getNavn()+" har løst "+studenter[i].getAntOpg()+"oppgaver \n";
        }
        return returVerdi;
    }



}
