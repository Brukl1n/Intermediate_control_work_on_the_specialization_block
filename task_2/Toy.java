package Intermediate_control_work_on_the_specialization_block.task_2;

public class Toy {
    private final String id;
    private final String name;
    private final int probability;

    public Toy(String id, String name, int probability) {
        this.id = id;
        this.name = name;
        this.probability = probability;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getProbability() {
        return probability;
    }
}