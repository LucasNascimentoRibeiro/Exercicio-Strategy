public class Disciplina {

    private double p1;
    private double p2;
    public double media;
    private String nome;
    public String situacao;

    private ICalcMedia CalcMedia;


    public Disciplina(ICalcMedia calcMedia) {
        this.CalcMedia = calcMedia;
    }


    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }


    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void CalcularMedia(){
        media = CalcMedia.CalculoMedia(p1, p2);
        situacao = CalcMedia.Situacao(media);
    }
}
