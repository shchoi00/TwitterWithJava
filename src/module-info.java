module Twitter {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	opens application to javafx.graphics, javafx.fxml;
}