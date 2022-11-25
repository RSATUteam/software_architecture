public interface IDB {
    void create(Object obj);
    Object read(int id);
    void update(int id, Object obj);
    void delete(int id);
}
