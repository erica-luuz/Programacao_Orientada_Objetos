public class Triangulo implements FormaGeometrica {
    public Triangulo() {}


    @Override
    public Double calcularArea(Double base, Double altura){
        Double area = (base * altura) / 2;
        return area;
    }
}
