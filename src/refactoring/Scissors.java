package refactoring;

public class Scissors extends Choice {

    @Override
    public Choice SeEnfrentaA(Choice choice) {
        if(choice instanceof Rock) return choice;
        if(choice instanceof Paper) return this;
        return null;
    }
    
    @Override
    public String toString() {
        return "Scissors";
    }
}
