module progii.modiv.ctaivoptii {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens progii.modiv.ctaivoptii to javafx.fxml;
    exports progii.modiv.ctaivoptii;
}