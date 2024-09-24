public class Example01Rectangle {
    /* Field */
    public int width;
    public int height;

    /* Construct */
    /* Method */
    public int getArea() {
        return (this.width*this.height);
    }
    public int getPerimeter(){
        return (2*(this.width+this.height));
    }
    public void modify(int width, int height){
        this.width = width;
        this.height = height;
    }
    public boolean equals(Example01Rectangle r){
        return (this.width==r.width && this.height==r.height);
    }
    public boolean sameArea(Example01Rectangle r){
        return (this.getArea()==r.getArea());
    }
}
