package models.expressions;

public class Number extends Expression {
    public double num;

    public Number(double num){
        this.num = num;
    }

    @Override
    public String toString(){
        return String.valueOf(num);
    }
}
