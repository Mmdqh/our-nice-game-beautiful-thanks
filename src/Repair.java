public class Repair extends Move {

    public Repair(String name, int energyCost) {
        super("Repair", Constants.REPAIR_COST);
    }

    // TODO: please someone implements the heal method.
    @Override
    protected void applyEffect(Robot user, Robot opponent) {
        user.heal(Constants.RECHARGE_AMOUNT);
    }
    // some condition in move plus the max health thing
    @Override
    public boolean isAvailable(Robot user) {
        return super.isAvailable(user)
                && user.getHealth() < Constants.MAX_HEALTH;
    }
}
