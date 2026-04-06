public class Triangle {
    public int perimeter;
    public int a,b,c;

    public Triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        perimeter=a+b+c;
    }
    
    public void triangleDetails(){
        System.out.println("Three sides of the triangle are: "+a+", "+b+", "+c);
        System.out.println("Perimeter: "+perimeter);
    }
    public String printTriangleType(){
        if (a==b && b==c ) {
            return "This is an Equilateral Triangle.";
        }
        else if (a==b||b==c||a==c) {
            return "This is an Isosceles Triangle.";
        }
        else{
            return "This is a Scalene Triangle.";
        }
    }

    public void compareTriangles(Triangle other){
        if (this == other) {
            System.out.println("These two triangle objects have the same address."); }
            else if (this.a == other.a && this.b == other.b && this.c == other.c) {
            System.out.println("Addresses are different but the sides of the triangles are equal.");}
            else if ((this.a + this.b + this.c) == (other.a + other.b + other.c)) {
            System.out.println("Only the perimeter of both triangles is equal.");}
            else{
                System.out.println("Addresses, length of the sides and perimeter all are different.");
            }
    
        }
}
