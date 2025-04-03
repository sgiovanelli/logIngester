import java.util.ArrayList;
import java.util.List;

class Record{
    String data;
    boolean commited = false;
    public Record(String newRecord){
        this.data = newRecord;
    }
    public String getData(){
        return data;
    }
}

class RecordStore{
    private List<Record> recordStore = new ArrayList<>();
    public void addRecord(String newData){
        recordStore.add(new Record(newData));
    }
    public List<Record> getAll(){
        return this.recordStore;
    }
}
class Handler{
    private RecordStore recordStore;
    public Handler(){
        this.recordStore = new RecordStore();
    }
    public void writeData(String in){
        this.recordStore.addRecord(in);
    }
    public List<Record> getAllRecords(){
        return this.recordStore.getAll();
    }
}


public class LogIngester {
    public static void main(String[] args){
        System.out.println("Hello Scott");
        Handler handler = new Handler();
        handler.writeData("Scott Giovanelli");
        handler.writeData("Evan Giovanelli");
        handler.writeData("Emma Giovanelli");
        handler.writeData("Essio Giovanelli");
        handler.writeData("Mike Maccio");

        handler.getAllRecords().forEach(i-> 
            System.out.println(i.getData()));
    }
    
}
