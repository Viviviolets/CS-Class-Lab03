// 
// Author: Vivianne Gonzalez
// Date: 2/27/2021
// CSCI-1152.R01: SPRING 2021
// Programming Assignment: LAB03
// Description: Find the fastest runner and print his or her time. With the use of arrays. 


public class Lab03 { // main method introduction 

public static int fastestIndex(int[] times){ //for loop with a if statment within to look for fastest time 
	int time = times[0];
	int index = 0;
	
	for(int i = 0; i < times.length; i++){
		if(times[i] < time) {
			time = times[i];
			index = i;
		}
	}
	return index;
}

public static int secondfastestIndex(int [] times, int i1){ // for loop with a if statment within to look for second fastest time
	int time2 = times[0];
	int i2 = 0;
	for( int j =0; j < times.length; j++) {
		if((times[j] != times[i1]) && (times[j] < time2) ){
			time2 = times[j];
			i2 = j;
		}
	}
	return i2;
}


public static void main (String [] arguments) { //uses scanner for input in command line
int[] array = new int[16];

    String[] names ={
      "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
      "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
      "Aaron", "Kate"
	};

    int[] times ={
      341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
      343, 317, 265
    };
	System.out.printf("%-20s%-15s", "Name","Time(minutes)"); // create table
	System.out.println("\n-----------------  ------------------");  
	for( int i = 0; i < array.length; i++){
		System.out.printf("%-20s%-15s\n", names[i], times[i] + ""); //prints out table of runners with times 
	}
	// declaring varibles to insert with array so its easier to match both arrays up
	int i1 = fastestIndex(times);
	int i2 = secondfastestIndex(times, i1);
	System.out.printf(" The fastest runner is:             %10s       Total time: %d minutes%n", names[i1], times[i1] );
	System.out.printf(" The second fastest runner is:      %10s       Total time: %d minutes%n", names[i2], times[i2] );
}// end method 
}// end class 


