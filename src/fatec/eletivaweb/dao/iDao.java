package fatec.eletivaweb.dao;

import java.util.List;

public interface iDao<Object> {

	boolean create(Object o);
	
	List<Object> read();
	
	void update(Object o);
	
	void delete(Object o);
}
