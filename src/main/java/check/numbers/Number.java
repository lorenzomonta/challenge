package check.numbers;

// this class represents a number and all the data related to it
public class Number {

    private String id; // for future purpose, corresponds to the database id
    private String number; // if modified is true, number represents the modified number
    private String enteredNumber; // enteredNumber represents the number entered at the beginning
    private boolean modified; // true if the number has been changed
    private boolean correct; // true if the number is correct
    private String annotation; // what has been modified

    // I assume that each number is correct

    public Number (){
        this.id = "";
        this.number = "";
        this.enteredNumber = "";
        this.modified = false;
        this.correct = true;
        this.annotation = "The number is correct!";
    }

    public Number (String enteredNumber){
        this.id = "";
        this.number = enteredNumber;
        this.enteredNumber = enteredNumber;
        this.modified = false;
        this.correct = true;
        this.annotation = "The number is correct!";
    }

    public Number (String id, String enteredNumber){
        this.id = id;
        this.number = enteredNumber;
        this.enteredNumber = enteredNumber;
        this.modified = false;
        this.correct = true;
        this.annotation = "The number is correct!";
    }

    public String getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getEnteredNumber() {
        return enteredNumber;
    }

    public boolean isModified() {
        return modified;
    }

    public boolean isCorrect() {
        return correct;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setEnteredNumber(String enteredNumber){ this.enteredNumber = enteredNumber; }

    public void setModified(boolean modified) {
        this.modified = modified;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @Override
    public String toString(){
        return "Number [id=" + id + ", number=" + number + ", correct=" + correct + ", annotations=" + annotation + "]";
    }

}
