public class NamesMain{
    public static void main(String [] args){
        // creating the object
        NamePrinter namePrinter = new NamePrinter();
        SurnamePrinter surnamePrinter = new SurnamePrinter();

        namePrinter.print();
        surnamePrinter.print();
    }
}