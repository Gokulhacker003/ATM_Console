package Notes;

import Note.*;

public class Notes<N extends Note> {
    private final N[] list =(N[]) new Note[4];
    private int lenoflist;


    public void add(N note){
        list[lenoflist]=note;
        lenoflist++;

    }
    public N[] getAll(){

        return list;
    }
}
