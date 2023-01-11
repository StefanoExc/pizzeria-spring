package pizza.configuration.pizza.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pizza.configuration.pizza.model.Pizza;
import pizza.configuration.pizza.model.impl.AnanasTopping;
import pizza.configuration.pizza.model.impl.PizzaMargherita;
import pizza.configuration.pizza.model.impl.ProsciuttoTopping;

@Configuration
public class BeansConfiguration {

    @Bean
    public AnanasTopping ingredienteAnanas(){
        return new AnanasTopping(1, "Ananas", 2.50);
    }

    @Bean
    public ProsciuttoTopping ingredienteProsciutto(){
        return new ProsciuttoTopping(2, "Prosciutto", 3.50);
    }

}