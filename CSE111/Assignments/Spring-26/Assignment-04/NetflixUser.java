public class NetflixUser {
    public String name;
    public String account;
    public boolean isFree;
    public Movie [] favourite = new Movie[3];
    public int count=0;

    public NetflixUser(String name,String account){
        this.name=name;
        this.account=account;
        if (account.equalsIgnoreCase("Free")) {
            isFree=true;
        }
        System.out.println("New user account created!");
    }
    public NetflixUser(String name){
        this.name=name;
        isFree=true;
        System.out.println("New user account created!");
    }

    public void addToFavourites(Movie obj){
        if (isFree) {
            System.out.println("Cannot add movies to favourites.Please upgrade to Netflix Premium.");
        }
        else{
            if (count<3) {
                favourite[count]=obj;
                count++;
                System.out.println("Movie added to favourites.");
            }
            else{
                System.out.println("Cannot add new movies.Favourite list is full.");
            }
        }
    }

    public void showFavourites(){
        if (count==0) {
            System.out.println("No available favourites.Please upgrade to Netflix Premium");
        }
        else{
            System.out.println("Showing "+name+"'s Favourites:");
            for(int i=0;i<count;i++){
                System.out.println(favourite[i].name+", "+favourite[i].catagory+", "+favourite[i].duration);
            }
        }
    }

    public void upgradePlan(){
        if (isFree) {
            isFree=false;
        System.out.println("Welcome to Netflix Premium!");
        }
        else{
            System.out.println("You already have Netflix Premium!");
        }
    }

}
