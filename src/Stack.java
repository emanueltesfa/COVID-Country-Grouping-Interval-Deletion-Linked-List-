
/**
 * This class deals with the handling of the stack functions that is used in the
 * main such as pushing and popping etc implemented using Link Lists.
 *
 * @author <Emanuel Tesfa>
 * @version <October 30, 2020>
 */

public class Stack {
	public Country country;
	public Link first;
	public Link next;
	public Link last;

	double stackSize;

	/**
	 * This is the constructor for the Stack class where the parameter of arrSize is
	 * passed from main and the stack Linked List is declared and top is set to 0.
	 * Nothing is returned.
	 *
	 * @param arrSize will be the length of the Country array
	 * @return null
	 */

	public Stack(double stackSize) {
		super();
		this.stackSize = stackSize;
	}

	/**
	 * This is a void type method with O(1) notation where the Linked List is loaded
	 * in by the insert Country object
	 *
	 * @param Country object insert is taken from main and loaded in
	 * @return
	 */

	public void push(Country c) {
		Link newLink = new Link(c);
		if (isEmpty())
			last = newLink;
		newLink.next = first;
		first = newLink;
	}

	/**
	 * This method takes out the top Country Linked List object from the Linked List
	 * and decrements the top of Linked List so that the next object is loaded top.
	 *
	 * @param
	 * @return Country object insert is taken from main and loaded in
	 */

	public Country pop() {
		Link temp = first;
		if (first.next == null)
			last = null;
		first = first.next;
		return temp.country;
	}

	/**
	 * This method simply prints out the contents of the Linked List in an orderly
	 * fashion using multiple print.
	 *
	 * @param
	 * @return
	 */

	public void printStack() {
		System.out.println("");
		Link current = first;

		System.out.println("\n\n\nStack Contents: \n"
				+ "\n\t\t\t       Name        Capitol   Population                     GDP      \t  Cases    Deaths"
				+ "\n-----------------------------------------------------------------------------------------------------------------");

		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}

	/**
	 * This method checks to see if the top variable is -1, if so then the boolean
	 * true is passed to show that the stack is empty as it is initialized to -1.
	 * 
	 * @param
	 * @return true - the stack is empty
	 * @return false - the stack is not empty
	 * 
	 */

	public boolean isEmpty() {
		if (first == null)
			return true;
		else
			return false;

	}

	/**
	 * This method checks to see if the top variable is the length of the array-1,
	 * if so then the boolean true is passed to show that the stack is full to the
	 * end of the array which as the last index is known as length minus 1.
	 * 
	 * @param
	 * @return true - stack is full
	 * @return false - stack is not full
	 */

	public boolean isFull() {
		if (first != null)
			return true;
		else
			return false;

	}

	/*
	 * This class provides the constructor and objects for the Linked List
	 */

	public class Link {

		private Country country;
		private Link next;

		/**
		 * This method is the constructor that loads in the country object
		 *
		 * @param Country Object c
		 * @return
		 */

		public Link(Country c) {
			country = c;
			// next = n;
		}

		/**
		 * 
		 * This method simply prints out the contents of the Linked List in an orderly
		 * fashion using multiple print.
		 *
		 * @param
		 * @return
		 */
		public void displayLink() {
			System.out.printf("\n  %33s %14s %12.0f \t%15.0f \t%7.0f\t %7.0f  ", country.getName(),
					country.getCapitol(), country.getPopulation(), country.getGDP(), country.getCases(),
					country.getDeaths());
		}

	}
}
