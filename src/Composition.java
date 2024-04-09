public class Composition {

    public static void main(String [] args){
        Data dt = new Data(1,1,2024);
        Client c = new Client("Juan", dt);
        System.out.printf("%s", c);


    }
}
