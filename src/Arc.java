import java.awt.Graphics;

public class Arc extends Shape {
    private int startAngle;
    private int arcAngle;

    public Arc() {
        super();
        this.startAngle = 10;
        this.arcAngle = 50;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle);
    }
}
