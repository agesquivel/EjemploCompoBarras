package sample;

import javafx.scene.control.Control;
import javafx.scene.control.Skin;

public class ControlBarras extends Control {
    @Override
    protected Skin<?> createDefaultSkin() {
        return new ControlSkinPrototype(this);
    }
}

