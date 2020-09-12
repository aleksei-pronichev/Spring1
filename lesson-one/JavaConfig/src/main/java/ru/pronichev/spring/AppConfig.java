package ru.pronichev.spring;
/* Конфигуация для Spring
 *
 * @author Aleksei Pronichev
 * 12.09.2020
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.pronichev.spring.base.Camera;
import ru.pronichev.spring.base.CameraRoll;
import ru.pronichev.spring.base.ColorCameraRoll;

@Configuration
public class AppConfig {
    @Bean(name="cameraRoll")
    public CameraRoll cameraRoll() {
        return new ColorCameraRoll();
    }

    @Bean(name="camera")
    public Camera camera(CameraRoll cameraRoll) {
        Camera camera = new Camera();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
}
