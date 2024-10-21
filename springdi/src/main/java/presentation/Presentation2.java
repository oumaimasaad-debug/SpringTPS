package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.
AnnotationConfigApplicationContext;
import org.springframework.context.annotation.
ComponentScan;
import org.springframework.context.annotation.
Configuration;

import config.AppConfig;
@Configuration
@ComponentScan(basePackages = {"dao", "metier"})
public class Presentation2 {
public static void main(String[] args) {
ApplicationContext context = new AnnotationConfigApplicationContext(Presentation2.class);
IMetier metier = context.getBean(IMetier.class);
System.out.println("Resultat = " +metier.calcul());
/*ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
IMetier metier2 = context2.getBean(IMetier.class);
System.out.println("Result: " +metier2.calcul()); // Affiche le résultat du calcul*/
}
}

