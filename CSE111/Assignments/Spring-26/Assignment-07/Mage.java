public class Mage extends GameCharacter {
    public int intelligence;
    public int mana;

    public Mage(String characterName,int level,int intelligence,int mana,String weaponType){
        super(characterName, level, weaponType);
        this.intelligence=intelligence;
        this.mana=mana;
        allCharacters[characterCount]=characterName;
        characterCount++;
        System.out.println("A new mage came to live");
    }

    public void calculateDamage(){
        super.totalDamage=(getLevel() * intelligence) + (mana * 10);
    }

    public String toString(){
        return getCharacterInfo()+"\nCharacter Type: Mage\nWeapon: "+weaponType+"\nIntelligence: "+intelligence+", Mana: "+mana+"\nTotal Damage: " + totalDamage;
    }
}
