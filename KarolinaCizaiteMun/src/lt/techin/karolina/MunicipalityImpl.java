package lt.techin.karolina;

import lt.techin.municipality.IllegalCitizenException;
import lt.techin.municipality.Municipality;
import lt.techin.municipality.Person;
import lt.techin.municipality.PersonPredicate;

import java.time.LocalDate;
import java.util.*;

public class MunicipalityImpl implements Municipality{
    List<Person> peopleList = new ArrayList<>();
    Person oldestPerson = null;
    LocalDate localDate = LocalDate.now();

    @Override
    public void registerCitizen(Person person) throws IllegalCitizenException {

        if (person.getLastName() == null
                || person.getLastName().isEmpty()
                || person.getFirstName() == null
                || person.getFirstName().isEmpty()
                || person.getDateOfBirth() == null
                || person.getDateOfBirth().isAfter(localDate)
                || person.getYearlyIncome() < 0) {
            throw new IllegalCitizenException(person);

        }
        if (!peopleList.contains(person)) {
            peopleList.add(person);
        }
    }

    @Override
    public int getCitizenCount() {
        System.out.println(peopleList);
        return peopleList.size();
    }

    @Override
    public double getAverageCitizenIncome() {
        double sumOfYearlyIncome = 0;
        for (Person person : peopleList) {
            sumOfYearlyIncome += person.getYearlyIncome();
        }
        int citizenCount = getCitizenCount();
        return sumOfYearlyIncome / citizenCount;
    }

    @Override
    public boolean isRegisteredCitizen(Person person) {
        if (person == null) {
            throw new IllegalArgumentException();
        }

        if (this.peopleList.contains(person)) {
            return true;
        }
        for (Person person1 : peopleList) {
            if (person1.getLastName().equals(person.getLastName()) &&
                    person1.getFirstName().equals(person.getFirstName())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public Person findOldestPerson() {
        if (peopleList.size() > 0) {
            oldestPerson = peopleList.get(0);
        }
        for (Person person : peopleList) {
            if (person.getDateOfBirth().isBefore(oldestPerson.getDateOfBirth())) {
                oldestPerson = person;
            }
        }
        return oldestPerson;
    }

    @Override
    public int countAdultCitizens() {
        int counter = 0;
        for (Person person : peopleList) {
            if (person.getDateOfBirth()
                    .isAfter(localDate.minusYears(18))) {
                counter++;

            }
        }
        return counter;
    }

    @Override
    public double totalIncomeInTaxes() {
        double totalTaxes = 0.0;
        for (Person person : peopleList) {
            if (person.getYearlyIncome() < 14000) {
            } else if (person.getYearlyIncome() > 1_000_000) {
                totalTaxes += person.getYearlyIncome() * 0.16;
            } else {
                totalTaxes += person.getYearlyIncome() * 0.15;
            }
        }
        return totalTaxes;
    }
    //TODO
    @Override
    public Collection<Person> findCitizensBy(PersonPredicate personPredicate) {
        return null;
    }

    @Override
    public Collection<Person> getOrderedCitizens() {
        peopleList.sort(Comparator.comparing(Person::getLastName)
                .thenComparing(Person::getFirstName));
        return peopleList;
    }
    //TODO
    @Override
    public Map<Integer, List<Person>> groupByYearOfBirth() {
//        Nesugebu rasti varianto, kaip localDate pakeisti i int verte
//        return peopleList.stream().collect(Collectors.groupingBy(Person::getDateOfBirth));
        return null;
    }
}
