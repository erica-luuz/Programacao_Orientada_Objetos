public class Quadrado implements FormaGeometrica {
    public Quadrado() {}

    @Override
    public Double calcularArea(Double base, Double altura){
        Double area = base * altura;
        return area;
    }
}
