public abstract class Move {
    // I made this class so I can initialize latestMove,
    // wallah I don't feel like adding anything now.Btw, IDEA recognizes 'wallah' as a valid word! amazing job.
    // them moves can't be changed.
    private final String name;
    private final int energyCost;

    public String getName() {
        return name;
    }

    public int getEnergyCost() {
        return energyCost;
    }

    public Move(String name, int energyCost) {
        this.name = name;
        this.energyCost = energyCost;
    }
}
