import java.util.Scanner;
public class TestStudente {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Studente studente=new Studente("Giuseppe",0);
        int contaQuestionari=0;
        int scelta;
        do{
            System.out.print("Inserisci il punteggio del quoestionario: ");
            studente.addQuiz(input.nextInt());
            contaQuestionari++;
            System.out.print("Inserisci un numero diverso da zero se vuoi inserire un nuovo questionario: ");
            scelta= input.nextInt();
            if(scelta!=0){
                contaQuestionari++;
            }
            System.out.println("Media dei punteggi: "+studente.getMediaPunteggi(contaQuestionari));
        }while (scelta!=0);
    }
}
