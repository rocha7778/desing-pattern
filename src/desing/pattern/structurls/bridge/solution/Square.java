package desing.pattern.structurls.bridge.solution;

class Square extends AbstractShape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Dibujando cuadrado");
        color.applyColor();
    }
}
