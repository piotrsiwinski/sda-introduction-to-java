package oop.mathematic;


public class Point {

    public float x;
    public float y;

    public double DistanceFromOrigin(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
}
