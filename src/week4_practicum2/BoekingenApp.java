package week4_practicum2;

import java.util.Arrays;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BoekingenApp extends Application{
	private Label label1, label2, label3, label4, label5, label6; 
	private TextField txtF1, txtF2;
	private DatePicker dp1, dp2;
	private ComboBox<KamerType> cb;
	private Button btn1, btn2;
	
	
	public static void main(String[] args){
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primarystage) throws Exception {
		primarystage.setResizable(false);
		primarystage.setTitle("Tweepersoonsboekingen");
		label1 = new Label("Voer uw gegevens in!");
		label2 = new Label("naam:");
		label3 = new Label("adres:");
		label4 = new Label("aankomstdatum:");
		label5 = new Label("vertrekdatum:");
		label6 = new Label("kamertype:");
		
		label1.setPrefWidth(350);
		for(Label l : Arrays.asList(label2, label3, label4, label5, label6)){
			l.setPrefWidth(100);
		}
		
		txtF1 = new TextField();
		txtF2 = new TextField();
		txtF1.setPrefWidth(220);
		txtF2.setPrefWidth(220);
		
		dp1 = new DatePicker();
		dp2 = new DatePicker();
		dp1.setPrefWidth(220);
		dp2.setPrefWidth(220);
		
		cb = new ComboBox<KamerType>();
		cb.setPrefWidth(220);
		
		btn1 = new Button("reset");
		btn2 = new Button("boek");
		

		HBox hb = new HBox(10);
		hb.getChildren().addAll(btn1, btn2);
		hb.setPrefWidth(330);
		hb.setAlignment(Pos.BOTTOM_RIGHT);
		FlowPane fp = new FlowPane(10, 10);
		fp.getChildren().addAll(label1, label2, txtF1, label3, txtF2, label4, dp1, label5, dp2, label6, cb, hb);
		fp.setPadding(new Insets(10, 0, 0, 10));
		Scene scene = new Scene(fp, 350, 250);
		
		primarystage.setScene(scene);
		primarystage.show();
	}
}
