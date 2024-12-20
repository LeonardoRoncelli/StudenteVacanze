public class Studente {
    private String nome;
    private int punteggioTot;
    public Studente(){
        nome="";
        punteggioTot=0;
    }
    public Studente(String nome,int punteggioTot){
        this.nome=nome;
        this.punteggioTot=punteggioTot;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setPunteggioTot(int punteggioTot){
        this.punteggioTot=punteggioTot;
    }
    public double getPunteggioTotale(){
        return punteggioTot;
    }
    public double addQuiz(int punteggio){
        int nuovoPunteggio;
        nuovoPunteggio=punteggioTot+punteggio;
        setPunteggioTot(nuovoPunteggio);
        return nuovoPunteggio;
    }
    public double getMediaPunteggi(int numQuestionari){
        double media;
        media=getPunteggioTotale()/numQuestionari;
        return media;
    }
}