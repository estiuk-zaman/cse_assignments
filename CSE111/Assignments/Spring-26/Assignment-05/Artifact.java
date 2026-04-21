public class Artifact {
    private String artifactName;
    private String addedBy;
    private int power;

    private static Artifact[] vault = new Artifact[4];
    private static int count = 0;
    private static String strongestName = "None";
    private static int strongestPower = -1;

    public Artifact(String artifactName, String addedBy) {
        this.artifactName = artifactName;
        this.addedBy = addedBy;
        this.power = calculatePower(this.artifactName);
        checkStrongest();
    }

    public Artifact(String artifactName) {
        this(artifactName, "Okabe");
    }

    private int calculatePower(String name) {
        int p = 0;
        if (name.length() % 2 == 0) {
            for (int i = 0; i < name.length(); i += 2) {
                p += name.charAt(i);
            }
        } else {
            for (int i = 1; i < name.length(); i += 2) {
                p += name.charAt(i);
            }
        }
        return p;
    }

    private void checkStrongest() {
        if (this.power > strongestPower) {
            strongestPower = this.power;
            strongestName = this.artifactName;
        }
    }

    public static void AddtoVault(Artifact obj) {
        if (count < 4) {
            vault[count] = obj;
            count++;
            System.out.println(obj.addedBy + " added " + obj.artifactName + " successfully to the vault.");
        } else {
            System.out.println("!!" + obj.addedBy + " unsuccessful in adding artifact to the vault!!");
        }
    }

    public static void labReport() {
        System.out.println("=== Future Gadget Lab ===");
        for (int i = 0; i < count; i++) {
            System.out.println(vault[i].artifactName + " added by " + vault[i].addedBy + " has power of " + vault[i].power + ".");
        }
    }

    public String GetName() {
        return this.artifactName;
    }

    public int CalcPower() {
        return this.power;
    }

    public static String strongest() {
        return strongestName;
    }

    public void revealArtifact() {
        System.out.println(this.artifactName + " added by " + this.addedBy + " has power of " + this.power + ".");
    }

    public void changeName(String newName) {
        this.artifactName = newName;
        this.power = calculatePower(this.artifactName);
        checkStrongest(); 
        System.out.println("Name changed and power recalculated.");
    }
}