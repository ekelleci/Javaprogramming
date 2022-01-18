package taskSolutions.day38;

public class States {

    //  variables:  name, abbreviation, politicalParty, Governor, senator, population, stateTax

    private String  name,abbreviation, politicalParty, governor, senator;
    private int  population;
    private double stateTax;

    // Create construction
    // Change this. to setVar because of setter and getters

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    /*Encapsulate all the fields
        Conditions:
        1. name, abbreviation, politicalParty, Governor, and senator can not be null
        2. name, abbreviation, politicalParty, Governor, and senator can not be empty
        3. taxRate can not be negative
        4. Population can not be set to zero or negative */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // set conditions p
        if(name == null){
            System.err.println("Name can not be null");
            System.exit(1); // 1: some thing went wrong
        }
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        // set conditions p
        if( abbreviation == null){
            System.err.println("Abbreviation can not be null");
            System.exit(1); // 1: some thing went wrong
        }
        if(abbreviation.isEmpty() ||abbreviation.isBlank()){
            System.err.println("Invalid Abbreviation");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty == null){
            System.err.println("PoliticalParty can not be null");
            System.exit(1); // 1: some thing went wrong
        }
        if(politicalParty.isEmpty() || politicalParty.isBlank()){
            System.err.println("Invalid PoliticalParty");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if(governor==null){
            System.err.println("Invalid entry");
            System.exit(1); // 1: some thing went wrong
        }
        if(governor.isEmpty() || governor.isBlank()){
            System.err.println("Invalid governor");
            System.exit(1);
        }
        this.governor=governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator == null){
            System.err.println("Senator can not be null");
            System.exit(1); // 1: some thing went wrong
        }
        if(senator.isEmpty() || senator.isBlank()){
            System.err.println("Invalid Senator");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population<=0){
            System.out.println("invalid entry");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<0){
            System.out.println("invalid entry");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    // Methods:
    //        toString() */


    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}

/*1. Create a class named States:
        variables:
        name, abbreviation, politicalParty, Governor, senator, population, stateTax

        Encapsulate all the fields

        Add a constructor that can set all the fields

        Conditions:
        1. name, abbreviation, politicalParty, Governor, and senator can not be null
        2. name, abbreviation, politicalParty, Governor, and senator can not be empty
        3. taxRate can not be negative
        4. Population can not be set to zero or negative

        Methods:
        toString() */
