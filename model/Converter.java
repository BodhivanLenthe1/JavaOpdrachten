package model;

public class Converter
{
	private double celcius;
	private double fahrenheit;
	private double kelvin;

	public Converter(double temp, String type)
	{
		if (type == "celcius")
		{
			this.celcius = temp;
			double fahrenheit = temp * 1.8 + 32;
			double kelvin = temp + 273.15;

			this.fahrenheit = fahrenheit;
			this.kelvin = kelvin;
		}
		if (type == "fahrenheit") {
			this.fahrenheit = temp;
			double celcius = (temp -32) / 1.8;
			double kelvin = (((temp - 32) * 5) / 9) + 273.15;
			
			this.celcius = celcius;
			this.kelvin = kelvin;
		}
		
		if (type == "kelvin") {
			this.kelvin = temp;
			double celcius = temp - 273.15;
			double fahrenheit = ((temp - 273.15)*1.8) + 32;
			
			this.celcius = celcius;
			this.fahrenheit = fahrenheit;
		}

	}

	public double getCelcius()
	{
		return celcius;
	}

	public void setCelcius(double celcius)
	{
		this.celcius = celcius;
	}

	public double getFahrenheit()
	{
		return fahrenheit;
	}

	public void setFahrenheit(double fahrenheit)
	{
		this.fahrenheit = fahrenheit;
	}

	public double getKelvin()
	{
		return kelvin;
	}

	public void setKelvin(double kelvin)
	{
		this.kelvin = kelvin;
	}

}
