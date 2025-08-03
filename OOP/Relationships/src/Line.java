// B47
public class Line {
    private Point begin, end;
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line(int x1, int y1, int x2, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public Point getBegin() {
        return begin;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public Point getEnd() {
        return end;
    }
    public double getLength() {
        return Math.sqrt(Math.pow(begin.getX() - end.getX(), 2) + Math.pow(begin.getY() - end.getY(), 2));
    }
}
