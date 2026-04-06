public class Home_Task_01 {
    public static void main(String[] args) {
    Player_01 ben = new Player_01("Ben", 10);
    System.out.println("======1======");
    ben.viewInfo();
    System.out.println("======2======");
    ben.defeatVillain("Vilgax", 100);
    System.out.println("======3======");
    ben.defeatVillain("Yamcha", 10);
    System.out.println("======4======");
    ben.viewInfo();
    System.out.println("======5======");
    ben.defeatVillain('8', "Vilgax", 100);
    System.out.println("======6======");
    ben.viewInfo();
    System.out.println("======7======");
    Player_01 kevin = new Player_01("Kevin");
    System.out.println("======8======");
    kevin.viewInfo();
    System.out.println("======9======");
    ben.defeatVillain(kevin);
    System.out.println("======10======");
    ben.viewInfo();
    System.out.println("======11======");
    Player_01 goku = new Player_01("Goku", 9000);
    System.out.println("======12======");
    ben.defeatVillain(goku);
  }

}
