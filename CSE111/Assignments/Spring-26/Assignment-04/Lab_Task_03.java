public class Lab_Task_03 {
    public static void main(String[] args) {
    Team b = new Team();
    b.updateName("Bangladesh");
    Player_01 mashrafi =  new Player_01("Mashrafi", 42, 100);
    b.addPlayer(mashrafi);
    Player_01 tamim =  new Player_01("Tamim", 35, 70);
    b.addPlayer(tamim);
    System.out.println("==============");
    b.printDetail();
    System.out.println("==============");
    Team a = new Team("Australia");
    Player_01 ponting =  new Player_01("Ponting", 50, 300);
    a.addPlayer(ponting);
    Player_01 lee =  new Player_01("Lee", 49, 200);
    a.addPlayer(lee);
    a.printDetail();
  }

}
