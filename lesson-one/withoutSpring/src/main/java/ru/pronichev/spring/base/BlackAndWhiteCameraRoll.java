package ru.pronichev.spring.base;
/* Черно-белая пленка
 *
 * @author Aleksei Pronichev
 * 27.06.2020
 */

public class BlackAndWhiteCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("-1 черно-белый кадр");
    }
}
