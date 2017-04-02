import com.patterndemo.admin.Admin;
import com.patterndemo.entities.AfricaFactory;
import com.patterndemo.entities.AmericaFactory;
import com.patterndemo.entities.ContinenteFactory;

public class Main {

    public static void main(String[] args){
        ContinenteFactory africa = new AfricaFactory();
        ContinenteFactory america = new AmericaFactory();
        Admin admin = Admin.getInstance();

        admin.initContinent(africa);
        admin.startFoodChain();

        admin.initContinent(america);
        admin.startFoodChain();
    }
}
