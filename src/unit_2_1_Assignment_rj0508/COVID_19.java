package unit_2_1_Assignment_rj0508;

public class COVID_19 {
	private String country;
	private String totalCases;
	private String newCases;
	private String totalDeaths;
	private String newDeaths;
	private String totalRecovered;
	private String newRecovered;
	private String activeCases;
	private String seriouCritical;
	private String totalTests;
	private String population;
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTotalCases() {
		return totalCases;
	}

	public void setTotalCases(String totalCases) {
		this.totalCases = totalCases;
	}

	public String getNewCases() {
		return newCases;
	}

	public void setNewCases(String newCases) {
		this.newCases = newCases;
	}

	public String getTotalDeaths() {
		return totalDeaths;
	}

	public void setTotalDeaths(String totalDeaths) {
		this.totalDeaths = totalDeaths;
	}

	public String getNewDeaths() {
		return newDeaths;
	}

	public void setNewDeaths(String newDeaths) {
		this.newDeaths = newDeaths;
	}

	public String getTotalRecovered() {
		return totalRecovered;
	}

	public void setTotalRecovered(String totalRecovered) {
		this.totalRecovered = totalRecovered;
	}

	public String getNewRecovered() {
		return newRecovered;
	}

	public void setNewRecovered(String newRecovered) {
		this.newRecovered = newRecovered;
	}

	public String getActiveCases() {
		return activeCases;
	}

	public void setActiveCases(String activeCases) {
		this.activeCases = activeCases;
	}

	public String getSeriouCritical() {
		return seriouCritical;
	}

	public void setSeriouCritical(String seriouCritical) {
		this.seriouCritical = seriouCritical;
	}

	public String getTotalTests() {
		return totalTests;
	}

	public void setTotalTests(String totalTests) {
		this.totalTests = totalTests;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return country + "\t" + totalCases + "\t" + newCases + "\t" + totalDeaths + "\t" + newDeaths + "\t"
				+ totalRecovered + "\t" + newRecovered + "\t" + activeCases + "\t" + seriouCritical + "\t" + totalTests
				+ "\t" + population;
	}

}
