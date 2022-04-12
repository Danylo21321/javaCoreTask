package Tasks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employye implements Serializable{
    public static final String path = "/Users/khrystyna_nykolyshyn/Documents/javaCoreTask";

    public static final File FILE = new File("1.txt");

    private String name;
    private transient int salary;
    private Object id;


    public void serialize(List<Employye> employyes) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(path + File.separator + FILE);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(employyes);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public List<Employye> deserialize(List<Employye> employyes) throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(path + File.separator + FILE);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        List<Employye> list = (List<Employye>) objectInputStream.readObject();
        System.out.println(list.toString());
        return list;
    }

    public void SerializeAndDeserialize(List<Employye> employyes) {
        try {
            serialize(employyes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            deserialize(employyes);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
