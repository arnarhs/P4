package models.expressions;

public class Number extends Expression {
    public String num;

    public Number(String num){
        this.num = num;
    }

    @Override
    public String toString(){
        return num;
    }
}
