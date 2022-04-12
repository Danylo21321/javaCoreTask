package Tasks;

import java.util.List;

public class StreamTask {
    public static void main(String[] args) {
        List<Person> list =
                List.of(new Person("woman","anna",20)
                , new Person("man","ivan",12)
                , new Person("man","petro",20)
                ,new Person("man","vitaliy",90)
                , new Person("women","olga",90));
        Builder peopleBuilder = new RealizePersonBuilder();


        peopleBuilder.filterPersonByAge(list).middleAgePerson(list)
                .showPeopleWhoWork(list).sorted(list).sechWomenName(list)
                .showAllPerson(list);


    }
}
