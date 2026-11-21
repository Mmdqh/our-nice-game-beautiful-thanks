public class Repair extends Move {

    public Repair(String name, int energyCost) {
        super("Repair", Constants.REPAIR_COST);
    }

    @Override
    protected void applyEffect(Robot user, Robot opponent) {
        // fixed a dumb bug here.
        user.heal(Constants.REPAIR_AMOUNT);
    }
    @Override
    public boolean isAvailable(Robot user) {
        return super.isAvailable(user)
                && user.getHealth() < Constants.MAX_HEALTH;
    }
}
