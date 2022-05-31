public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDSQL();

        cocheCRUD.save(new Coche("Peugeot", 5));
        cocheCRUD.delete();
        cocheCRUD.findAll();
    }
}
