package check.numbers;

import java.util.List;

public class Validator {

    private Number number;
    private List<Number> numbers;

    public Validator(Number number){
        this.number = number;
    }

    public Validator(List<Number> numbers){
        this.numbers = numbers;
    }

    public void validateNumber(){
        auxValidate(number);
    }

    public void validateNumbers(){
        for (Number i : numbers) {
            auxValidate(i);
        }
    }

    public void auxValidate(Number i){
        String temp = i.getNumber();
        if (!temp.matches("[0-9]+")) {
            i.setCorrect(false);
            i.setAnnotation("The number must contain only digits!");
        } else if (!temp.matches("^(2783).*")){
            i.setCorrect(false);
            i.setAnnotation("The number must begin with 2783!");
        }else if (temp.length() != 11) {
            i.setCorrect(false);
            i.setAnnotation("The numbers must be 11 digits!");
        } else {
            i.setAnnotation("The number is correct!");
        }
    }

    public Number getNumber(){
        return number;
    }

    public List<Number> getNumbers() {
        return numbers;
    }
}
