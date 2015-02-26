public class android {
// Class to keep track of Android Phones
// CMP112 Ashlee Troop on Feb 23, 2015
public String make;
public String model;
public String year;
public String color;
/* ----------------------------------------------------------------------- */
android() {
make= "No make";
model = "No model";
year = "No year";
color = "No color";
}
android(String thisMake, String thisModel, String thisYear, String thisColor) {
this();
make= thisMake;
model = thisModel;
year = thisYear;
color = thisColor;
}
public String toString() {
String output = "";
output = "Make: " + make + " Model: " + model + " Year: " + year + " Color: " + color; 
return output;
	}
}
