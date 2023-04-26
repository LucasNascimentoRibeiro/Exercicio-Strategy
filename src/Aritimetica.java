public class Aritimetica implements ICalcMedia{
    @Override
    public double CalculoMedia(double p1, double p2) {
        return (p1+p2)/2;
    }

    @Override
    public String Situacao(double media) {
        if(media >=5){
            return "aprovado";
        }else {
            return "Reprovado";
        }
    }


}
