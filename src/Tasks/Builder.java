package Tasks;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public interface Builder {
    Builder filterPersonByAge(List<Person> people);

    Builder middleAgePerson(List<Person> people);

    Builder showPeopleWhoWork(List<Person> people);

    Builder maxAge(List<Person> people);

    Builder sorted(List<Person> people);

    Builder sechWomenName(List<Person> people);

    Builder showAllPerson(List<Person> people);

    Builder showText();

}
class RealizePersonBuilder implements Builder{
    @Override
    public Builder filterPersonByAge(List<Person> people) {
        people.stream().filter(person -> person.getSex().equals("man"))
                .filter(person -> person.getAge() < 60).filter(person -> person.getAge() >= 18)
                .forEach(System.out::println);
        return this;
    }

    @Override
    public Builder middleAgePerson(List<Person> people) {
        OptionalDouble middleAge = people.stream().mapToDouble(Person::getAge).average();
        System.out.println("middleAge = "+ middleAge);
        return this;
    }

    @Override
    public Builder showPeopleWhoWork(List<Person> people) {
        people.stream().filter(person -> person.getSex().equals("man"))
                .filter(person -> person.getAge() <= 60)
                .filter(person -> person.getAge() >=18)
                .forEach(System.out::println);

        people.stream().filter(person -> person.getSex().equals("woman"))
                .filter(person -> person.getAge() <= 60)
                .filter(person -> person.getAge() >=18)
                .forEach(System.out::println);

        return this;
    }

    @Override
    public Builder maxAge(List<Person> people) {
        Person maxAge = people.stream().max(Comparator.comparingDouble(Person::getAge)).get();
        System.out.println(maxAge);
        return this;
    }

    @Override
    public Builder sorted(List<Person> people) {
        people.stream().sorted((o1, o2) -> {
            int result = o1.getAge() - o2.getAge();
            if (result == 0) {
                return o1.getName().compareTo(o2.getName());
            }
            return result;
        });
        return this;
    }

    @Override
    public Builder sechWomenName(List<Person> people) {
            people.stream().filter(person -> person.getSex().equals("women"))
                    .filter(person -> person.getName().contains("a"))
                    .forEach(System.out::println);
            return this;
    }


    @Override
    public Builder showAllPerson(List<Person> people) {
        people.forEach(System.out::println);
        return this;
    }

    @Override
    public Builder showText() {
        System.out.println("   ");
        return this;
    }
}