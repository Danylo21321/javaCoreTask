package Tasks;


import java.util.List;


public interface Builder {
    Builder filterPersonByAge(List<Person> people);

    Builder middleAgePerson(List<Person> people);

    Builder showPeopleWhoWork(List<Person> people);

    Builder maxAge(List<Person> people);

    Builder sorted(List<Person> people);

    Builder sechWomenName(List<Person> people);

    Builder showAllPerson(List<Person> people);

    Builder showText();

    Builder minAge(List<Person> people);

}
