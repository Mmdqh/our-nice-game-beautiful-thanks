public class Shield extends Move {

  public Shield(String name, int energyCost) {
    super("Shield", Constants.SHIELDED_ATTACK_DAMAGE);
  }
  // Do The setter please, i want to do it myself but i dont want to intervene in other classes outside my scope
  @Override
  protected void applyEffect(Robot user, Robot opponent) {
    if (!user.isShielded())
      user.activateShield();
    }

}
