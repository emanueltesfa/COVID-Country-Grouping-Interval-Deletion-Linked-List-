
/**
 * This class deals with the handling of the Queues functions that is used in
 * the main such as pushing and popping etc.
 * 
 * @author <Emanuel Tesfa>
 * @version <October 1, 2020>
 */

public class Queue {
	public Country country;
	public Link last;
	public Link next;
	public Link first;
	public double size;

	/**
	 * This is the constructor for the Queue class where the parameter of cQueue is
	 * passed from main and the cQueue is declared and top is set to 0. Nothing is
	 * returned.
	 *
	 * @param queSize will be the length of the Country queArray
	 * @return null
	 */

	public Queue(int size) {
		super();
		this.size = size;
	}

	/**
	 * This is a void type method with O(1) notation where the cQueue is loaded in
	 * by the insert Country object by implementing the link list in the first link.
	 *
	 * @param Country object insert is taken from main and loaded in
	 * @return
	 */

	public void insertFront(Country c) {
		Link newLink = new Link(c);
		if (isEmpty())
			last = newLink;
		else
			first.previous = newLink;
		newLink.next = first;
		first = newLink;
	}

	/**
	 * This is a void type method with O(1) notation where the cQueue is loaded in
	 * by the insert Country object by implementing the Link list at the last link.
	 *
	 * @param Country object insert is taken from main and loaded in
	 * @return
	 */

	public void insertEnd(Country c) {
		Link newLink = new Link(c);
		if (isEmpty())
			first = newLink;
		else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}

	/**
	 * This method takes out the top Country array object from the queue and
	 * decrements the top of queue.
	 *
	 * @param Country object insert is taken from main and loaded in
	 * @return the queArr at the length minus 1 is returned
	 */
	
	public Country removeFront() {
		Link temp = first;
		if (first.next == null)
			last = null;
		else
			first.next.previous = null;
		first = first.next;

		return temp.country;
	}

	/**
	 * This method takes out the top Country array object from the queue and
	 * decrements the bottom of queue.
	 *
	 * @param Country object insert is taken from main and loaded in
	 * @return the queArr at the length minus 1 is returned
	 */
	
	public Country removeEnd() {
		Link temp = last;
		if (first.next == null)
			first = null;
		else
			last.previous.next = null;
		last = last.previous;
		return temp.country;
	}

	/**
	 * This method simply prints out the contents of the queue Array in an orderly
	 * fashion using 2 print statements.
	 *
	 * @param
	 * @return
	 */

	public void printQueue() {
		System.out.println("");
		Link current = first;

		System.out.println("\n\n\nQueue Contents: \n"
				+ "\n\t\t\t      Name        Capitol   Population              GDP     \t  Cases   Deaths"
				+ "\n--------------------------------------------------------------------------------------------------------");

		while (current != last) {
			current.displayLink();
			current = current.next;
		}
		current.displayLink();
	}

	/**
	 * This method checks to see if the nItems variable is 0, if so then the boolean
	 * true is passed to show that the queue is empty as it is initialized to 0.
	 * 
	 * @param
	 * @return true - the queue is empty
	 * 
	 */

	public boolean isEmpty() {
		if (first == null)
			return true;
		else
			return false;
	}

	/**
	 * This method checks to see if the nItems variable is equivalent to the size,
	 * if so then boolean true is returned.
	 * 
	 * @param
	 * @return true - queue is full
	 */
	public boolean isFull() {
		if (first != null)
			return true;
		else
			return false;
	}

	/**
	 * This method takes parameter of upper and lower bounds and deletes from the
	 * link list with the CFR within that range.
	 *
	 * @param Double upper bound
	 * @param Double lower bound
	 * @return the queArr at the length minus 1 is returned
	 */
	public boolean intervalDelete(double lower, double upper) {
		Link current = first;
		while (current != null) {
			if ((current.country.getCFR()) >= lower && (current.country.getCFR()) <= upper) {
				if (current == first)
					first = current.next;

				else
					current.previous.next = current.next;
				if (current == last)
					last = current.previous;
				else
					current.next.previous = current.previous;
			} else {
				if (current.next == first)
					return false;
			}
			current = current.next;
		}
		return true;
	}

	/*
	 * This class provides the constructor and objects for the Linked List
	 */

	class Link {
		private Country country;
		private Link next;
		private Link previous;

		
		 /** 
		 * This method is the constructor that loads in the country object
		 *
		 * @param Country Object
		 * @return
		 */

		public Link(Country c) {
			country = c;
		}

		/**
		 * This method simply prints out the contents of the queue Array in an orderly
		 * fashion using 2 print statements.
		 *
		 * @param
		 * @return
		 */
		public void displayLink() {
			System.out.printf("\n %33s %14s %12.0f \t%15.0f \t%7.0f\t %7.0f  ", country.getName(), country.getCapitol(),
					country.getPopulation(), country.getGDP(), country.getCases(), country.getDeaths());
		}

	}

}
