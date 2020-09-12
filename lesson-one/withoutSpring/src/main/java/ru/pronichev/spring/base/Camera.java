package ru.pronichev.spring.base;
/* Класс Камеры
 *
 * @author Aleksei Pronichev
 * 27.06.2020
 */

public class Camera {
    private CameraRoll cameraRoll;

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Щелк");
        cameraRoll.processing();
    }
}
