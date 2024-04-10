public class Composition {

    public static void main(String [] args){
        Data dt = new Data(1,1,2024);
        Data wd = new Data(2, 2, 2024);
        Client c = new Client("Juan", dt, wd);

        System.out.printf("%s", c);


    }
}
