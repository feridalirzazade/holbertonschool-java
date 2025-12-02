public class PositiveInteger {
    private int value;
    PositiveInteger(int value){
        if(value > 0) this.value = value;
        else throw new IllegalArgumentException("Value is not a positive integer");
    }
    PositiveInteger(String value){
        int value1 = Integer.parseInt(value);
        if( value1 > 0) this.value = value1;
        else throw new IllegalArgumentException("Value is not a positive integer");
    }
    public boolean isPrime() {
        if (value <= 1) return false;

        for (int i = 2; i < value; i++) {
            if (value % i == 0) return false;
        }

        return true;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value) {
        if(value > 0) this.value = value;
        else throw new IllegalArgumentException("Value is not a positive integer");
    }
    public void setValor(int value) {
        if(value > 0) this.value = value;
        else throw new IllegalArgumentException("Value is not a positive integer");
    }
}
