public class Library {
    public int capacity=0;
    public int totalBook=0;
    String [] arr;
    int count=0;

    public Library(int capacity){
        this.capacity=capacity;
        arr = new String [capacity];
        System.out.println("A library has been created with capacity "+ capacity);
    }
    public void addBook(String bookName){
        if (count<capacity) {
            arr[count]= bookName;
            count++;
            totalBook++;
            System.out.println("Book '"+bookName+"' addes to the library");
        }
        else{
            System.out.println("Exceeds maximum capacity. You can't add more than "+ capacity +" books");
        }
    }
    public void printDetail(){
        System.out.println("Maximum Capacity: "+capacity);
        System.out.println("Total Books: "+ totalBook);
        System.out.println("Book List:");
        for(int i =0;i<totalBook;i++){
            System.out.println(arr[i]);
        }
    }
}
