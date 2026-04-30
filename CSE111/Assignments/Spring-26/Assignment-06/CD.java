public class CD extends Product{
    public String band;
    public int duration;
    public String genere;

    public CD(int id,String title,int price,String band,int duration,String genere){
        super(id,title,price);
        this.band=band;
        this.duration=duration;
        this.genere=genere;
    }

    public String printDetail(){
        return getIdTitlePrice()+" Band: "+band+" Duration: "+duration+" Genere: "+genere;
    }
}
