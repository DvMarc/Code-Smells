package refactoring;

public class Paper extends Choice{
    @Override
    public Choice SeEnfrentaA(Choice choice) {
        if(choice instanceof Scissors) return choice;
        if(choice instanceof Rock) return this;
        return null;
    }
    
    @Override
    public String toString() {
        return "Paper";
    }
    
}
