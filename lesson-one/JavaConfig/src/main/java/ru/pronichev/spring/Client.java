package ru.pronichev.spring;
/* Класс запуска
 *
 * @author Aleksei Pronichev
 * 27.06.2020
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.pronichev.spring.base.Camera;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Camera camera = context.getBean("camera", Camera.class);
        camera.doPhotograph();
    }
}