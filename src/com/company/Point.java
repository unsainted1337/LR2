package com.company;

public class Point {
    private int x, y;
    // Конструкторы (перегружаемые)
    public Point() { // Конструктор по умолчанию
        this.x = 0;
        this.y = 0;
    }

    public Point( int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX () {
        return this.x;
    }
    public void setX ( int x){
        this.x = x;
    }
    public int getY () {
        return this.y;
    }
    public void setY ( int y){
        this.y = y;
    }


    public String toString () {
        return "(" + this.x + ", " + this.y + ")";
    }

    public int[] getXY () {
        int[] results = new int[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    public void setXY ( int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance ( int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    // Возвращает расстояние от данного объекта до заданной точки -
    //объекта класса Point с именем another
    public double distance (Point another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff - yDiff * yDiff);
    }
    // Возвращает расстояние от данного объекта до точки (0,0)
    public double distance () {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        System.out.println(p1);
        Point p2= new Point();
        System.out.println(p2);

        p1.setX(3);
        p1.setY(4);
        System.out.println(p1);
        System.out.println("X:" +p1.getX());
        System.out.println(p1.distance(p1));

    }

}
