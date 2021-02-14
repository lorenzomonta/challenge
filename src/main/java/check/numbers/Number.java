package check.numbers;

public class Number {

    private String id;
    private String number;
    private boolean correct;
    private String annotation;

    public Number (String number){
        this.id = "";
        this.number = number;
        this.correct = true;
        this.annotation = "";
    }

    public Number (String id, String number){
        this.id = id;
        this.number = number;
        this.correct = true;
        this.annotation = "";
    }

    public String getId() {
        return id;
    }

    public String getNumber() {
        return number;
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
