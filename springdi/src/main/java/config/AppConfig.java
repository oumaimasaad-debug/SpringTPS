package config;


import dao.DaoImpl3;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"metier", "dao"}) // Ajustez en fonction de votre structure de package
public class AppConfig {

    @Bean
    public IDao dao() {
        return new DaoImpl3(); // Retourne l'implémentation de DaoImpl2
    }

    @Bean
    public IMetier metier(IDao dao) {
    	MetierImpl m =new MetierImpl();
    	m.setDao(dao);
        return m; // Injection de DaoImpl2 dans MetierImpl
    }
}
