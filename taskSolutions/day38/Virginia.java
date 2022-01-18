package taskSolutions.day38;

public class Virginia extends States {

    private String zipcode;

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        if (zipcode==null) {
            System.err.println(" Invalid entry");
            System.exit(1);
        }
        if (zipcode.isBlank()||zipcode.isEmpty())
        {
            System.err.println(" Invalid entry");
            System.exit(1);
        }
        this.zipcode = zipcode;
    }


    public void makingWine(){
        System.out.println( getName()+" is famous for Wine yards");
    }

    public Virginia( String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax, String zipcode) {
        super("Virginia", abbreviation, politicalParty, governor, senator, population, stateTax);
        setZipcode(zipcode);
    }

    @Override
    public String toString() {
        return "Virginia{" +
                "name='" + getName() + '\'' +
                ", abbreviation='" + getAbbreviation() + '\'' +
                ", politicalParty='" + getPoliticalParty() + '\'' +
                ", Governor='" +getGovernor() + '\'' +
                ", senator='" + getSenator() + '\'' +
                ", population=" + getPopulation() +
                ", stateTax=" + getStateTax() +
                "zipcode='" + zipcode + '\'' +
                '}';
    }
}

/*
2. Create the following sub classes of States and add any additional fields and methods if necessary:
				1. Virginia
				2. California
				3. Texas
				4. Florida

3. Create a class named StateObjects
					Create the objects of each sub classes

					test all the functions of each objects

            		Analyze the relationships between the classes
 */