package fatec.eletivaweb.dao;

import java.util.List;

public interface DAO<Object> {

	void create(Object user);
	
	List<Object> read();
	
	void update(Object user);
	
	void delete(int userId);
	
	Object getUserById(int userId);
}
