// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_5_2
// File Name: Pizza.java

// JavaFX application that allows the user to 
// select pizza toppings using checkboxes.
// Calculates the price if each is $0.50 and the pizza is $10.

// Imports I used 
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class Pizza extends Application
{
    
    // Checkboxes for the gridpane, names of toppers, 
    // and math later on to decide the final price
    CheckBox input1 = new CheckBox("Pineapple (Ew)");
    CheckBox input2 = new CheckBox("Pepperoni");
    CheckBox input3 = new CheckBox("Mushroom");
    CheckBox input4 = new CheckBox("Garlic");
    CheckBox input5 = new CheckBox("Sausage");
    CheckBox input6 = new CheckBox("Olives");
    
    // Creates an output for use of the GridPane and the user to read
    Text output = new Text("Your total is: $10.00!");
    
    @Override
    public void start(Stage primaryStage) 
    {
        
        // GridPane that handles all of the information displaying, 
        // button, checkboxes, and output for the reader to see.
        GridPane grid = new GridPane();
        grid.setVgap(5);
        grid.setHgap(50);
        
        //Displays the name of the toppings and the checkboxes for the toppings
        grid.add(input1, 0, 1);
        grid.add(input2, 0, 2);
        grid.add(input3, 0, 3);
        grid.add(input4, 0, 4);
        grid.add(input5, 0, 5);
        grid.add(input6, 0, 6);
        
        // On each click of a checkbox the 
        // java program prompts the action event to be triggered
        input1.setOnAction(this::processCheckBoxAction);
        input2.setOnAction(this::processCheckBoxAction);
        input3.setOnAction(this::processCheckBoxAction);
        input4.setOnAction(this::processCheckBoxAction);
        input5.setOnAction(this::processCheckBoxAction);
        input6.setOnAction(this::processCheckBoxAction);
        
        // Creates the output for the user to read their total price
        grid.add(output, 0, 7);
        
        //Positions the gridpane and creates the background color
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color: white");
        
        // Creates the scene with the GridPane and sets the size
        Scene scene = new Scene(grid, 500, 500);

        // Titles the stage and sets other needed start properties
        primaryStage.setTitle("Pizza Maker");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public void processCheckBoxAction(ActionEvent event) 
    {
        // Sets the default price of the pizza with dough, sauce, and cheese
        double price = 10; 
        
        // Math to calculate the price of the pizza for each checkbox option
        if (input1.isSelected())
        {
            price = price + .50;
        }
        
        if (input2.isSelected())
        {
            price = price + .50;
        }
        
        if (input3.isSelected())
        {
            price = price + .50;
        }
        
        if (input4.isSelected())
        {
            price = price + .50;
        }
        
        if (input5.isSelected())
        {
            price = price + .50;
        }
        
        if (input6.isSelected())
        {
            price = price + .50;
        }
        
        // Converts the price to a string for output on the user's side 
        String finalPrice = Double.toString(price);
        
        // Crudely formats for readability
        // Output for the user to read
        output.setText("Your total is: $" + finalPrice +"0!");
        
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
