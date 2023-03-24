package latihan2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Latihan2 {

    public static void main(String[] args) {
         
        List<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        
        
        List<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        
        
        Iterator<String> iterator = Hewan.iterator();
        while (iterator.hasNext()) {
            String hewan = iterator.next();
            if (DeleteHewan.contains(hewan)) {
                iterator.remove();
                
                
        System.out.println("Isi objek Hewan setelah penghapusan data: " + Hewan);
            }
}
}
}