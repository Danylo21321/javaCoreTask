package Tasks;

import java.util.ArrayList;
import java.util.List;

public class SerializeAndDeSerialize {
    public static void main(String[] args) {
        List<Employye> employyes = new ArrayList<>();
        employyes.add(new Employye("ivan",21321,323));
        Employye employye = new Employye();
        employye.SerializeAndDeserialize(employyes);
    }

}
