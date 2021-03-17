package com.company;

import java.util.Arrays;

public class Line {
    Point begin, end;

    public Line(int x1, int y1, int x2, int y2){
        begin = new Point(x1,y1);
        end = new Point(x2, y2);
    }
    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX(){

        return begin.getX();
    }

    public void setBeginX(int x){

        begin.setX(x);
    }

    public int getBeginY(){
        return begin.getY();
    }

    public void setBeginY(int y){
        begin. setY(y);
    }
    public int[] getBeginXY() {
        return begin.getXY();
    }
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int x){
        end. setX(x);
    }
    public int getEndY(){
        return end. getY();
    }
    public void setEndY(int y){

        end. setY(y);
    }
    public int[] getEndXY() {
        return end.getXY();
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }
    public String toString () {
        return "Отрезок[начало=" + begin + ",конец =  " + end + "]";
    }

    public double getLength(){
        return begin.distance(end);
    }

    public double getGradient(){
        double x = getBeginX();
        double x1 = getEndX();
        double y = getBeginY();
        double y1=getEndY();
        return ((y1 - y) / (x1 - x)) ;
    }

    public double distance ( int x, int y){
        int xDiff = getBeginX() - x;
        int yDiff = getBeginY() - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance (Point p){
        int xDiff = getBeginX() - p.getX();
        int yDiff = getBeginY() - p.getY();
        return Math.sqrt(xDiff * xDiff - yDiff * yDiff);
    }



    public static void main (String[] args){
        Line line = new Line(2,3,4,5);
        Line line1 = new Line(3,4,5,7);
        Line line2 = new Line(4,5,7,1);
        Point point = new Point(2,5);
        line.setBeginXY(4,5);
        line.setEndXY(2,3);
        System.out.println("begin XY " + line.getBeginX() + line.getBeginY());
        System.out.println("end XY" + line.getEndX() + line.getEndY());
        System.out.println(line.distance(point));
        

    }
}
