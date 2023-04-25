package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import model.Converter;

public class Guihandler
{
	Label titleText, celciusText, fahrenheitText, kelvinText;
	TextField celciusInput, fahrenheitInput, kelvinInput;
	Button okButton, cancelButton;

	public Guihandler(GridPane pane)
	{
		pane.setVgap(5);
		pane.setHgap(8);
		pane.setPadding(new Insets(10, 15, 20, 15));

		titleText = new Label("Temperature Converter");

		celciusText = new Label("Celcius: ");
		fahrenheitText = new Label("Fahrenheit: ");
		kelvinText = new Label("Kevin: ");

		celciusInput = new TextField();
		fahrenheitInput = new TextField();
		kelvinInput = new TextField();

		okButton = new Button("OK");
		cancelButton = new Button("Cancel");

		pane.add(titleText, 1, 0);

		pane.add(celciusText, 0, 1);
		pane.add(celciusInput, 1, 1);

		pane.add(fahrenheitText, 0, 2);
		pane.add(fahrenheitInput, 1, 2);

		pane.add(kelvinText, 0, 3);
		pane.add(kelvinInput, 1, 3);

		pane.add(okButton, 0, 4);
		pane.add(cancelButton, 1, 4);

		okButton.setOnAction(event -> convertTemp());
		cancelButton.setOnAction(event -> cancelInput());

	}

	private void convertTemp()
	{
		try
		{
			if (celciusInput.getText() == "" && kelvinInput.getText() == "")
			{
				String fahrenheitString = fahrenheitInput.getText();
				double fahrenheitDouble = Double.parseDouble(fahrenheitString);
				Converter convertTemp = new Converter(fahrenheitDouble, "fahrenheit");

				double celcius = convertTemp.getCelcius();
				double kelvin = convertTemp.getKelvin();

				String celciusStringDone = Double.toString(celcius);
				String kelvinStringDone = Double.toString(kelvin);

				celciusInput.setText(celciusStringDone);
				fahrenheitInput.setText(fahrenheitString);
				kelvinInput.setText(kelvinStringDone);
			}

			if (fahrenheitInput.getText() == "" && kelvinInput.getText() == "")
			{
				String celciusString = celciusInput.getText();
				double celciusDouble = Double.parseDouble(celciusString);
				Converter convertTemp = new Converter(celciusDouble, "celcius");

				double fahrenheit = convertTemp.getFahrenheit();
				double kelvin = convertTemp.getKelvin();

				String fahrenheitStringDone = Double.toString(fahrenheit);
				String kelvinStringDone = Double.toString(kelvin);

				celciusInput.setText(celciusString);
				fahrenheitInput.setText(fahrenheitStringDone);
				kelvinInput.setText(kelvinStringDone);
			}

			if (fahrenheitInput.getText() == "" && celciusInput.getText() == "")
			{
				String kelvinString = kelvinInput.getText();
				double kelvinDouble = Double.parseDouble(kelvinString);
				Converter convertTemp = new Converter(kelvinDouble, "kelvin");

				double fahrenheit = convertTemp.getFahrenheit();
				double celcius = convertTemp.getCelcius();

				String fahrenheitStringDone = Double.toString(fahrenheit);
				String celciusStringDone = Double.toString(celcius);

				celciusInput.setText(celciusStringDone);
				fahrenheitInput.setText(fahrenheitStringDone);
				kelvinInput.setText(kelvinString);
			}
		} catch (Exception NumberFormatException)
		{
			celciusInput.setText("Voer een geldig getal in");
			fahrenheitInput.setText("Voer een geldig getal in");
			kelvinInput.setText("Voer een geldig getal in");
		}
	}

	private void cancelInput()
	{
		celciusInput.setText("");
		fahrenheitInput.setText("");
		kelvinInput.setText("");
	}
}
