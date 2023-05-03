public class Quadrado implements FormaGeometrica {
    private Double base;
    private Double altura;
    private Double area;

    public Quadrado() {}

    public Quadrado(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void calcularArea(){
        this.setArea(this.getBase() * this.getAltura());
        System.out.println("O resultado da área do quadrado é: " + this.getArea());
    }
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
