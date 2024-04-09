public class Client {

    private String name;
    private Data dateOfBirth;
    private Data weddingDay;
//    private int birthday;
//    private int birthMonth; Using new Data class we simplify the code. Instead of the three field we have
//    private int birthYear;  only one.

    public Client(String n, Data dt){
        this.name = n;
        this.dateOfBirth = dt;
    }

//    public Client(String n, Data wd){
//        this.name = n;
//        this.weddingDay = wd;
//    }


    public String toString(){
        return String.format("Name: %s%nDate of birthday:%s", name, dateOfBirth);

    }

}
