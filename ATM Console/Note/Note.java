package Note;

// The Note class represents a banknote with a value and a count
public abstract class Note implements Cloneable {
    protected String note;  // The value of the note (e.g., "2000", "500")
    protected long count;   // The number of such notes

    protected Note(String notes,long counts){
        note=notes;
        count=counts;
    }
    public String getNote() {
        return note;
    }


    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public Note clone() throws CloneNotSupportedException {
        return (Note) super.clone(); // Create and return a copy of the object
    }

}
