public class Triangle {
    public int a =0,b=0,c=0;
    public int para=0;
    public boolean address=false;

    public Triangle(int a ,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public void triangleDetails(){
        System.out.println("Three sides of the triangle are: "+a+","+b+","+c);
        System.out.println("Parimeter: "+(a+b+c));
    }

    public String printTriangleType(){
        if (a==b && b==c) {
            return "This is an Equilateral Triangle";
        }
        else if ((a==b||a==c||b==c)) {
            return "This is an Isosceles Triangle";
        }
        else{
            return "This is an Scalene Triangle";
        }
    }

    public void compareTriangles(Triangle obj){
        if (this==obj) {
            System.out.println("These two triangle objects have the same address.");
        }
        else{
            boolean equalSide=false;
            boolean samePari=false;
            if (this.a+this.b+this.c==obj.a+obj.b+obj.c) {
                samePari=true;
            }
            if (this.a==obj.a && this.b==obj.b && this.c==obj.c) {
             equalSide=true;
            }
            if (equalSide) {
                System.out.println("Addresses are different but the sides of the triangles are equal.");
            }
            else if (!equalSide && !samePari) {
                System.out.println("Addresses, length of the sides and perimeter all are different.");
            }
            else if(!equalSide && samePari){
                System.out.println("Only the perimeter of both triangles is equal.");
            }
        }
    }
}
