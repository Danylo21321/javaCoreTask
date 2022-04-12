package Tasks;

public class GennericsTask {
    public static void main(String[] args) {
        MyEntry<Integer,String> myEntry = new MyEntry<>();
        myEntry.put(1,"1");
        myEntry.put(2,"2");
        myEntry.put(3,"3");

        myEntry.remove(1,"1");
        myEntry.removeByKey(2);

        myEntry.sowAllMyEntry();

        myEntry.showKey();

        myEntry.showValue();
    }
}
