import javax.swing.JOptionPane;

public class CurrencyConversion {

public static void main(String[] args) {

int x = 0;
double result,result1, result2;
String THAI = "THAI", EURO ="EURO", JPY = "JPY";

String name = JOptionPane.showInputDialog("What is your name: ");
String message = String.format("Welcome %s, to the Currency Exchange Program ", name); /*inputs name in %s*/ 
JOptionPane.showMessageDialog(null,  message); //displays the String format message
String currency = JOptionPane.showInputDialog("Which currency do you wish to exchange: "+THAI+ ", "+EURO+ ", "+JPY);
x = Integer.parseInt (JOptionPane.showInputDialog("Insert US Dollar Amount: "));
result = x * 32.57; //US TO THAI
result1 = x * .86; //US TO EURO
result2 = x * 117.50; //US TO JPY


if (currency == "THAI"){
    JOptionPane.showMessageDialog(null,"US Dollar Amount of "+x+ " dollars to be converted to "+THAI+" is: ");
    JOptionPane.showMessageDialog(null,result+ " BAHT");
}if (currency == "EURO"){
        JOptionPane.showMessageDialog(null,"The Amount of "+x+ " dollars to be converted to "+EURO+" is: ");
        JOptionPane.showMessageDialog(null,result1+ " EURO");
}if (currency == "JPY"){
            JOptionPane.showMessageDialog(null,"The Amount of "+x+ " dollars to be converted to "+JPY+" is: ");
            JOptionPane.showMessageDialog(null,result2+ " JPY");
}//end THAI if


}//end main
