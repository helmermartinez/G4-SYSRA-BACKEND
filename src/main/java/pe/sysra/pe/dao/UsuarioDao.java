package pe.sysra.pe.dao;

import java.util.List;
import java.util.Map;

import pe.sysra.pe.entity.Usuario;

public interface UsuarioDao {
	int create (Usuario u);
	int update (Usuario u);
	int delete (int id);
	Usuario read (int id);
	List<Map<String, Object>> readAll();

}
