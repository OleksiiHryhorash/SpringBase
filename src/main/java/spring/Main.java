package spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.impl.car.Audi;
import spring.impl.car.Kia;

public class Main {

    public static void main( String[] args )
    {
        ApplicationContext  ctx = new AnnotationConfigApplicationContext(Config.class);

        Audi audi = ctx.getBean(Audi.class);
        audi.move();
        audi.getNavigationSystem().createRoute();
        audi.getAudioSystem().playRadio();


        ctx.getBean(Kia.class).move();
    }
}
