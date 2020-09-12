package ru.pronichev.spring;
/* Класс запуска
 *
 * @author Aleksei Pronichev
 * 12.09.2020
 */

import ru.pronichev.spring.base.Camera;

public class Client {
    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        Camera camera = assistant.getCamera();
        camera.doPhotograph();
    }
}
