package ru.pronichev.spring;
/* Класс запуска
 *
 * @author Aleksei Pronichev
 * 12.09.2020
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.pronichev.spring.base.Camera;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Camera camera = context.getBean("camera", Camera.class);
        camera.doPhotograph();
    }
}