package dao;
import org.springframework.stereotype.Component;
@Component("dao")
public class DaoImpl implements IDao {
	public DaoImpl() {
	}
@Override
public double getValue() {
return 100.0;
}



}