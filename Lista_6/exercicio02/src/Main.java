public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Double areaQuadrado = quadrado.calcularArea(10.0,10.0);

        Triangulo triangulo = new Triangulo();
        Double areaTriangulo = triangulo.calcularArea(10.0,10.0);

        System.out.println(" o resultado da área do quadrado é: " + areaQuadrado);
        System.out.println(" O resultado da área do triangulo é: " + areaTriangulo);
    }

}