public class Attack extends Move {

    public Attack(String name, int energyCost) {
        super("Attack", Constants.ATTACK_COST);
    }

    // TODO: please someone implements the takeDamage method.
    @Override
    protected void applyEffect(Robot user, Robot opponent) {
        if (opponent.isShielded()) opponent.takeDamage(Constants.SHIELDED_ATTACK_DAMAGE);
        else opponent.takeDamage(Constants.ATTACK_DAMAGE);
    }

}
