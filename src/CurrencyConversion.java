/***********************************************************************
Program Name: CurrencyConversion.java
Programmer's Name: Aviram Moran
Program Description: This program converts currency between USD, YEN and European EURO
***********************************************************************/

import javax.swing.JOptionPane;
import java.text.NumberFormat; //used to format to Currency
import java.util.Locale;

public class CurrencyConversion {
	public static void main(String[] args) {

		double  Amount2COnvert = 0;
		double result, result1, result2, result3, result4, result5;
		String YEN = "YEN", EURO = "EURO", USD = "USD", currency = "";
		NumberFormat toUSD = NumberFormat.getCurrencyInstance(Locale.US);; //use NumberFormat class to format double into Currency 
		NumberFormat toEURO = NumberFormat.getCurrencyInstance(Locale.UK);
		NumberFormat toYEN = NumberFormat.getCurrencyInstance(Locale.JAPANESE);
		
		
		{
			//Reform input validation to match one of three possible inputs
			while ((!(currency.equals(USD) || currency.equals(YEN) || currency
					.equals(EURO)))) {
				currency = JOptionPane
						.showInputDialog("Please select USD, YEN or EURO Currency to exchange: "
								+ YEN + ", " + EURO + ", " + USD).toUpperCase();				
			}
		}
		{
			Amount2COnvert = Double.parseDouble(JOptionPane
					.showInputDialog("Insert Amount to convert: "));
			result = Amount2COnvert * 123.14; // Convert USD TO YEN
			result1 = Amount2COnvert * .9; // Convert USD TO EURO
			result2 = Amount2COnvert * .0081; // Convert YEN to USD
			result3 = Amount2COnvert * .0073; // Convert YEN to EURO
			result4 = Amount2COnvert * 1.11; // Convert EURO to USD
			result5 = Amount2COnvert * 136.08; // Convert EURO to YEN

			{
				if (currency.equals("YEN")) {
					JOptionPane.showMessageDialog(null, toYEN.format(Amount2COnvert) + " YEN" + " = "
							+ toUSD.format(result2) + " USD" + " or " + toEURO.format(result3) + " EUR");
				} else if (currency.equals("EURO")) {
					JOptionPane.showMessageDialog(null, toEURO.format(Amount2COnvert) + " EURO" + " = "
							+ toUSD.format(result4) + " USD" + " or " + toYEN.format(result5) + " YEN");
				} else {
					JOptionPane.showMessageDialog(null, toUSD.format(Amount2COnvert) + " USD" + " = "
							+ toYEN.format(result) + " YEN" + " or " + toEURO.format(result1) + " EUR");
				}
			}
		}
	}
}
