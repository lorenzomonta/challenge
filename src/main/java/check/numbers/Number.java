package check.numbers;

public class Number {

    private String id;
    private String number;
    private String enteredNumber;
    private boolean modified;
    private boolean correct;
    private String annotation;

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
