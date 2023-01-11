package pizza.configuration.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pizza.configuration.pizza.config.BeansConfiguration;
import pizza.configuration.pizza.model.Pizza;

@SpringBootApplication
public class PizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);

		Pizza pizzaMargherita = (Pizza) ctx.getBean("ingredienteAnanas");
		pizzaMargherita.printPizzas();
	}

}
