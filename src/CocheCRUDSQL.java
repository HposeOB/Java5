import java.util.List;

public class CocheCRUDSQL implements CocheCRUD {
    @Override
    public void save(Coche coche) {
        System.out.println("save");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("findAll");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("delete");

    }
}
