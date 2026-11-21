public class Shield extends Move {

  public Shield(String name, int energyCost) {
    super("Shield", Constants.SHIELDED_ATTACK_DAMAGE);
  }

  @Override
  protected void applyEffect(Robot user, Robot opponent) {
    // i removed the chec, its just dumb.
      user.activateShield();
    }

}
