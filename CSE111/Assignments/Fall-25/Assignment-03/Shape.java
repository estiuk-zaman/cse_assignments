
public class Shape {
    public String shapeString;
    public double area;
    
    public void setParameters(String shapeString,int r){
        this.shapeString=shapeString;
        area=(double)(3.1416*r*r);
    }
    public void setParameters(String shapeString,int a,int b){
        this.shapeString=shapeString;
        area=(double)(0.5*a*b);
    }
    public void setParameters(String shapeString,double a,double b){
        this.shapeString=shapeString;
        area=(double)(a*b);
    }
    
    public String details(){
        return "Shape Name: "+ shapeString+"\n Area: "+area;
        
}
}
