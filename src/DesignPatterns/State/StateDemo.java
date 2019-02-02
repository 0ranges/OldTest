package DesignPatterns.State;

import java.sql.Connection;

/**
 * Created by user on 2017/4/12.
 */
public class StateDemo {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);

        state.setValue("true");
        context.method();

        state.setValue("false");
        context.method();
    }
}
class State{
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public void method1(){
        System.out.println("state is true");
    }
    public void method2(){
        System.out.println("state is false");
    }
}
class Context{
    private State state;
    public Context(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void method(){
        if("true".equals(state.getValue())){
            state.method1();
        }else if("false".equals(state.getValue())){
            state.method2();
        }
    }
}
