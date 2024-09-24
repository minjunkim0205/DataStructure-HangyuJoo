public class Example02Complex {
    /*Field */
    private double real;
    private double imaginary;
    /*Construct */
    Example02Complex(){
        this.real = 0;
        this.imaginary = 0;
    }
    Example02Complex(double r){
        this.real = r;
    }
    Example02Complex(double r, double i){
        this.real = r;
        this.imaginary = i;
    }
    /*Method */
    public String toString(){
        return (this.real+"+"+this.imaginary+"i");
    }
    public Example02Complex add(Example02Complex f){
        double temp_real = this.real + f.real;
        double temp_imaginary = this.imaginary + f.imaginary;
        return (new Example02Complex(temp_real, temp_imaginary));
    }
    public Example02Complex multiply(Example02Complex f){
        double temp_real = this.real * f.real + (-1 *this.imaginary * f.imaginary) ;
        double temp_imaginary = this.real*f.imaginary + f.real*this.imaginary;
        return (new Example02Complex(temp_real, temp_imaginary));
    }
}