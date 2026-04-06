public class Shape2D {
    public String type ="";
    public double area = 0.0;
    
    public Shape2D () {
        type = "Square";
        area = 5*5;
        System.out.println("A " + type+ " has been created with length: 5");
    }
    public Shape2D(int length , int width){
        area=length*width;
        type = "Rectangle";
        System.out.println("A " + type+ " has been created with length: "+ length + " and breath: "+ width);
    }
    public Shape2D(int height,int base,String type){
        this.type=type;
        area=0.5*height*base;
        System.out.println("A " + type+ " has been created with height: "+ height + " and base: "+ base);
    }
    public Shape2D(int a,int b,int c){
        type="Rectangle";
        double s = (a+b+c)/2;
        area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("A " + type+ " has been created with following sides: " +a+","+b+","+c);
    }
    public void area(){
        System.out.println("The area of the "+type+" is:" + area);
    }
    }