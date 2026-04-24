public class B extends A
{
    //public int x = 20;
    //public int x =50;
    public static int y = 25;

    public void method3(){
        System.out.println(y);
        System.out.println(this.y);
    }

//      public void method2(){
//      //int x = 45;
//      System.out.println(x);        // local -> Own instance/static -> Parent instance/static
//      System.out.println(this.x);   // Own instance/static -> Parent instance/static
//      System.out.println(super.x);  // Parent instance/static
//      System.out.println(B.x);      // Own static -> Parent static
//      System.out.println(A.x);      // Parent static
//  }

    // public void method1(){
    //     int y = 45;
    //     System.out.println(y);        // local -> Own instance -> Parent instance
    //     System.out.println(this.y);   // Own instance -> Parent instance
    //     System.out.println(super.y);  // Parent instance
    // }
} 