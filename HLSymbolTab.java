import java.util.ArrayDeque;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HLSymbolTab {
    
    static Hashtable<Integer,String> nameHashtable = new Hashtable<>();
    static Hashtable<String,ArrayDeque> stackHashtable = new Hashtable<>();

    static ArrayDeque<String> activation = new ArrayDeque<>();

    public Integer addSymbol(String name) {
        if(nameHashtable.contains(name) == false) {
            Integer i = Integer.valueOf(nameHashtable.size()+1);
            nameHashtable.put(i, name);
            ArrayDeque<Object> stack = new ArrayDeque<>();
            stackHashtable.put(name, stack);
            return i;
        }
        else {
            for(Map.Entry<Integer,String> e : nameHashtable.entrySet()) {
                if(e.getValue().equals(name) == true) {
                    return e.getKey();
                }
            }
            return 0;
        }
    }

    public String getName(Integer key) {
        return nameHashtable.get(key);
    }

    public int getSize() {
        return nameHashtable.size();
    }

    public ArrayDeque getObject(String key) {
        return stackHashtable.get(key);
    }

    public void removeLocal() {
        Iterator value = activation.iterator();

        while(value.hasNext()) {
            ArrayDeque stack = getObject(value.next().toString());
            stack.removeLast();
            // System.out.println("after removal: "+stack);
        }
    }
}
