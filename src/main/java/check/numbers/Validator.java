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
        String temp = i.getEnteredNumber();
        if (!temp.matches("[0-9]+")) {
            i.setCorrect(false);
            i.setAnnotation("The number must contain only digits!");
        } else {
            if (!temp.matches("^(2783).*")){
                //System.out.println("Before check: " + (!temp.matches("^(2783).*")) + " " + i.getEnteredNumber());
                i.setNumber(replaceFirst(temp));
                i.setModified(true);
                temp = i.getNumber();
                //System.out.println("After check: " + (!temp.matches("^(2783).*")) + " " + i.getNumber());
            }
            if (temp.length() != 11) {
                i.setCorrect(false);
                i.setModified(false);
                i.setAnnotation("The numbers must be 11 digits!");
            }
        }
    }

    public String replaceFirst (String str){
        StringBuilder sb;
        if (str.charAt(0) != '2') {
            str = '2' + str;
        }
        if (str.charAt(1) != '7') {
            sb = new StringBuilder(str);
            sb.insert(1, '7');
            str = sb.toString();
        }
        if (str.charAt(2) != '8') {
            sb = new StringBuilder(str);
            sb.insert(2, '8');
            str = sb.toString();
        }
        if (str.charAt(3) != '3') {
            sb = new StringBuilder(str);
            sb.insert(3, '3');
            str = sb.toString();
        }
        return str;
    }

    public Number getNumber(){
        return number;
    }

    public List<Number> getNumbers() {
        return numbers;
    }
}
