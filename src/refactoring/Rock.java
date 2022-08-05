package refactoring;

public class Rock extends Choice {

    @Override
    public Choice SeEnfrentaA(Choice choice) {
        if(choice instanceof Paper) return choice;
        if(choice instanceof Scissors) return this;
        return null;
    }
    
    @Override
    public String toString() {
        return "Rock";
    }
}
