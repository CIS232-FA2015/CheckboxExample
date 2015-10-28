package cis232.classexample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class CheckboxExampleController {

    @FXML
    private Button button;

    @FXML
    private CheckBox cbxChoice3;

    @FXML
    private CheckBox cbxChoice2;

    @FXML
    private CheckBox cbxChoice1;

    @FXML
    private Label lblOutput;

    @FXML
    void buttonClickListener() {
    	StringBuilder sb = new StringBuilder();
    	boolean prevSelected = false;
    	sb.append("You chose: ");
    	if(cbxChoice1.isSelected()){
    		sb.append("choice 1");
    		prevSelected = true;
    	}
    	
    	if(cbxChoice2.isSelected()){
    		if(prevSelected){
    			sb.append(", ");
    		}
    		sb.append("choice 2");
    		prevSelected = true;
    	}
    	
    	if(cbxChoice3.isSelected()){
    		if(prevSelected){
    			sb.append(", ");
    		}
    		sb.append("choice 3");
    		prevSelected = true;
    	}
    	
    	sb.append(".");
    	lblOutput.setText(sb.toString());
    }

}