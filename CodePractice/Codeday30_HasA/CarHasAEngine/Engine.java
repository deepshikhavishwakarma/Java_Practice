package CodePractice.Codeday30_HasA.CarHasAEngine;

public class Engine {
    private String model;



    public Engine(String model) {
        this.model = model;
    }

    public String getModel() {

        return model;
    }

    @Override
    public String toString() {
        return "model='" + model;
    }
}
