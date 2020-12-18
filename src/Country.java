
/**
 * Country class includes the declaration for the variables that pertain to the
 * CSV. Getters and setters are
 *
 * @author <Emanuel Tesfa>
 * @version <September 13, 2020>
 */

public class Country {

	private String name = "", capitol = "";
	private double population = 0, gdp = 0, cases = 0, deaths = 0;

	/*
	 * This method is the constructor
	 *
	 * @param parameter description of the parameter (one for each)
	 * 
	 * @return
	 */

	public Country() {
		super();
	}

	public int countryCompare(Country i) {

		return i.name.compareTo(this.name);
	}

	/*
	 * Method is the getter for the name (String) variable and is a String type
	 * method
	 *
	 * @param no parameter
	 * 
	 * @return name
	 */

	public String getName() {
		return name;
	}

	/*
	 * Method is the setter for the name (String) variable and is a void type method
	 * with the Name variable is passed as a parameter
	 *
	 * @param no parameter
	 * 
	 * @return
	 */

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * Method is the getter for the Capitol (String) variable and is a String type
	 * method
	 *
	 * @param no parameter
	 * 
	 * @return capitol
	 */

	public String getCapitol() {
		return capitol;
	}

	/*
	 * Method is the setter for the Capitol (String) variable and is a void type
	 * method with the Capitol variable passed a parameter
	 *
	 * @param no parameter
	 * 
	 * @return
	 */

	public void setCapitol(String capitol) {
		this.capitol = capitol;
	}

	/*
	 * Method is the getter for the Population (Double) variable and is a String
	 * type method
	 *
	 * @param no parameter
	 * 
	 * @return population
	 */

	public double getPopulation() {
		return population;
	}

	/*
	 * Method is the setter for the Population (Double) variable and is a void type
	 * method with the population variable passed a parameter
	 *
	 * @param no parameter
	 * 
	 * @return
	 */

	public void setPopulation(double population) {
		this.population = population;
	}

	/*
	 * Method is the getter for the GDP (Double) variable and is a double type
	 * method
	 *
	 * @param no parameter
	 * 
	 * @return gdp
	 */

	public double getGDP() {
		return gdp;
	}

	/*
	 * Method is the setter for the GDP (Double) variable and is a void type method
	 * with the GDP variable passed as a parameter
	 *
	 * @param no parameter
	 * 
	 * @return
	 */

	public void setGDP(double gDP) {
		gdp = gDP;
	}

	/*
	 * Method is the getter for the Cases (Double) variable and is a double type
	 * method
	 *
	 * @param no parameter
	 * 
	 * @return cases
	 */

	public double getCases() {
		return cases;
	}

	/*
	 * Method is the setter for the Cases (Double) variable and is a void type
	 * method taking Cases a parameter
	 *
	 * @param Double Cases
	 * 
	 * @return
	 */

	public void setCases(double cases) {
		this.cases = cases;
	}

	/*
	 * Method is the getter for the Deaths (Double) variable and is a double type
	 * method
	 *
	 * @param no parameter
	 * 
	 * @return deaths
	 */

	public double getDeaths() {
		return deaths;
	}

	/*
	 * Method is the setter for the deaths (Double) variable and is a Double type
	 * method
	 *
	 * @param Double deaths
	 * 
	 * @return
	 */

	public void setDeaths(double deaths) {
		this.deaths = deaths;
	}

	/*
	 * This method declares the new variable "CFR" which acts at the Case Fatality
	 * Rate variable in the sorting methods. CFR is defined as deaths/cases. The
	 * method is a Double type and returns the CFR variable.
	 *
	 * @param parameter
	 * 
	 * @return the double of deaths divided by cases
	 */

	public double getCFR() {
		return deaths / cases;
	}

	/*
	 * This method declares the new variable "Per Capita" which acts at the GDP per
	 * Capita variable in the sorting methods. GDP per Capita is defined as
	 * GDP/Population. The method is a Double type and returns the perCapita
	 * variable.
	 *
	 * @param parameter
	 * 
	 * @return the double of gdp divided by population at that index
	 */

	public double getPerCapita() {
		return gdp / population;
	}

}
