public abstract class Player {
    // you cant make an object of just "player", either human or robot, so we call it abstract
    // I also don't know what to add
    private final String name;
    // I do this here because a player, was it a human or a computer, must have a Robot against it.
    // Hope it works really
    private final Robot robot;
    //TODO: Add a move or lastMove or something please someone else do this why im a having a breakdown

    public Player(String name, Robot robot) {
        this.name = name;
        this.robot = new Robot();
    }

    public String getName() {
        return name;
    }

    public Robot getRobot() {
        return robot;
    }
}
