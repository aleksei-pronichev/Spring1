package ru.pronichev.spring;
/* Помощник по камере
 *
 * @author Aleksei Pronichev
 * 12.09.2020
 */

import ru.pronichev.spring.base.Camera;
import ru.pronichev.spring.base.CameraRoll;
import ru.pronichev.spring.base.ColorCameraRoll;

public class Assistant {
    public Camera getCamera() {
        Camera camera = new Camera();
        CameraRoll cameraRoll = new ColorCameraRoll();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
}
