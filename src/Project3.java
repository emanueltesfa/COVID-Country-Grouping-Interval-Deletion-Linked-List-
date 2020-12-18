
/**
* COP 3530: Project 3 – Linked Lists
* <p>
* The main consists of the variable and object declaration, user interactive portion with Scanner, 
* the initialization of c object array. It also continues to load/print of priority queue and stack.
* Furthermore also uses alternating insertions/removal for both stack and queues.
*
* @author <Emanuel Tesfa>
* @version <October 1, 2020>
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Name: Emanuel Tesfa \n\n");

		// Variable and Object Declaration
		Country[] c = new Country[153];
		Stack cStack = new Stack(153);
		Queue cQueue = new Queue(153);

		String name = null, capitol = null, fileName = null;
		double gdp = 0, population = 0, cases = 0, deaths = 0, upperB = 0, lowerB = 0;
		int i = 0;
		Country temp = null;

		// User Interactive portion with Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter in name of file, followed by enter"); //Countries3.csv
		
		fileName = input.next();

		Scanner read = new Scanner(new File(fileName));

		read.useDelimiter(",|\\n");

		// Initialization of c object array
		for (int j = 0; j < 153; j++)
			c[j] = new Country();

		// Parsing of CSV File
		while (read.hasNext()) {
			read.nextLine();

			name = read.next();
			capitol = read.next();
			population = read.nextDouble();
			gdp = Double.parseDouble(read.next());
			cases = read.nextDouble();
			deaths = Double.parseDouble(read.next());

			c[i].setName(name);
			c[i].setCapitol(capitol);
			c[i].setPopulation(population);
			c[i].setGDP(gdp);
			c[i].setCases(cases);
			c[i].setDeaths(deaths);

			i++;
		}
		// Loading of Priority Queue
		for (i = 0; i < c.length; i++) {
			if ((c[i].getCFR() > 0.01) && (c[i].getCFR() <= 0.02)) {
				cStack.push(c[i]);
				continue;
			} else if ((c[i].getCFR() > 0.02) && (c[i].getCFR() <= 0.05)) {
				cStack.push(c[i]);
				continue;
			} else if ((c[i].getCFR() > 0.05) && (c[i].getCFR() <= 0.1))
				cStack.push(c[i]);
		}

		cStack.printStack();

		// Alternating insertion
		double j = 0;
		while (cStack.isEmpty() != true) {
			if (j % 2 == 0)
				cQueue.insertFront(cStack.pop());
			else
				cQueue.insertEnd(cStack.pop());
			j++;
		}

		cQueue.printQueue();
		System.out.println("\n\nEnter in range, first number as lower bound and the second as a upper bound:");
		//for example 0.025 and 0.035 
		
		lowerB = input.nextDouble();
		upperB = input.nextDouble();
		
		cQueue.intervalDelete(lowerB, upperB);
		cQueue.intervalDelete(0.025, 0.035);

		cQueue.printQueue();

		// Alternating insertion
		double h = 0;

		while (cQueue.isEmpty() != true) {
			if (h % 2 == 0)
				cStack.push(cQueue.removeFront());
			else
				cStack.push(cQueue.removeEnd());
			h++;
		}

		cStack.printStack();

	}

}
