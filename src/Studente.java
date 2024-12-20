public class Studente {
    private String nome;
    private double punteggioTot;
    public Studente(){
        nome="";
        punteggioTot=0;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setPunteggioTot(double punteggioTot){
        this.punteggioTot=punteggioTot;
    }
    public double getPunteggioTot(){
        return punteggioTot;
    }
}