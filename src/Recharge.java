public class Recharge extends Move {
  public Recharge(String name, int energyCost) {
    super("Recharge", Constants.RECHARGE_COST);
  }
  // Cant add energy if yours is full, can you?
  @Override
  public boolean isAvailable(Robot user) {
    return user.getEnergy() < Constants.MAX_ENERGY;
  }
  // do the gainEnergy please
  @Override
  protected void applyEffect(Robot user, Robot opponent) {
    if (user.getEnergy() < Constants.MAX_ENERGY)
      user.gainEnergy(Constants.RECHARGE_AMOUNT);
  }
}
