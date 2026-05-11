public class Warrior extends GameCharacter {
    public int Strength;
    public int Armor;

    public Warrior(String characterName,int level,int Strength,int Armor,String weaponType){
        super(characterName, level, weaponType);
        this.Strength=Strength;
        this.Armor=Armor;
        allCharacters[characterCount]=characterName;
        characterCount++;
        System.out.println("A new warrior has arrived");
    }

    public void calculateDamage(){
        super.totalDamage=(getLevel() * Strength) + (Armor * 50);
    }

    public String toString(){
        return getCharacterInfo()+"\nCharacter Type: Warrior\nWeapon: "+weaponType+"\nStrength: "+Strength+", Armor: "+Armor+"\nTotal Damage: "+totalDamage;
    }
}
