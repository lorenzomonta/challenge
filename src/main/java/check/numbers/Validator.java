package check.numbers;

import java.util.List;

// this class is used to validate one or more number objects
public class Validator {

    private Number number; // is used to verify a single number
    private List<Number> numbers; // is used to verify two or more numbers

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
        // check if the number contains only digits
        if (!temp.matches("[0-9]+")) {
            i.setCorrect(false);
            i.setAnnotation("The number must contain only digits!");
        } else {
            // check if the number prefix is correct
            if (!temp.matches("^(2783).*")){
                i.setNumber(replaceFirst(temp));
                i.setModified(true);
                temp = i.getNumber();
            }
            // check if the number has 11 digits
            if (temp.length() != 11) {
                i.setCorrect(false);
                i.setModified(false);
                i.setAnnotation("The numbers must be 11 digits!");
            }
        }
    }

    /* attempt to correct incorrectly formed numbers
     * add the prefix of the number if missing or incomplete
     */
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
