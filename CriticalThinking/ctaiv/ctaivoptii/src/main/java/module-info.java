module csc372.modiv.ctaivoptii {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens csc372.modiv.ctaivoptii to javafx.fxml;
    exports csc372.modiv.ctaivoptii;
}