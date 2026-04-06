public class Lab_Task_04 {
    public static void main(String[] args) {
    Library a1 = new Library(3);
    System.out.println("1-------------");
    a1.addBook("Ice");
    System.out.println("2-------------");
    a1.printDetail();
    System.out.println("3-------------");
    a1.addBook("Emma");
    a1.addBook("Wings");
    a1.addBook("Next");
    System.out.println("4-------------");
    a1.printDetail();
    System.out.println("5-------------");
    Library a2 = new Library(4);
    System.out.println("6-------------");
    a2.addBook("Onnobhubon");
    a2.addBook("Ami");
    System.out.println("7-------------");
    a2.printDetail();
    System.out.println("8-------------");
    a2.addBook("Deyal");
    a2.addBook("Himu");
    a2.addBook("Megher Upor Bari");
    System.out.println("9-------------");
    a2.printDetail();
  }

}
