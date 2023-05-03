public class Triangulo implements FormaGeometrica {
    private Double base;
    private Double altura;
    private Double area;

    public Triangulo() {}

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
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

    @Override
    public void calcularArea() {
        this.setArea((this.getBase() * this.getAltura()) / 2);
        System.out.println("O resultado da área do triângulo é: " + this.getArea());
    }
}
