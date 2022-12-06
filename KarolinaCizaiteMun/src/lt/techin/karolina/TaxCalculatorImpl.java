package lt.techin.karolina;

import lt.techin.municipality.Person;
import lt.techin.municipality.TaxCalculator;

public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public double calculateTax(Person person) {
        double tax = 0;
        if (person.getYearlyIncome() < 14000) {
            tax += 0;
        } else if (person.getYearlyIncome() < 1_000_000) {
            tax = person.getYearlyIncome() * 0.16;
        } else {
            tax = person.getYearlyIncome() * 0.15;
        }
        return tax;
    }
}
