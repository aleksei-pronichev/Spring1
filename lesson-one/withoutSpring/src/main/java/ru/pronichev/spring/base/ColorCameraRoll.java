package ru.pronichev.spring.base;

/* Цветная Пленка
 *
 * @author Aleksei Pronichev
 * 27.06.2020
 */

public class ColorCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("-1 Цветной кадр");
    }
}
