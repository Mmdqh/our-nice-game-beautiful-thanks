public abstract class Player {
    // you cant make an object of just "player", either human or robot, so we call it abstract
    // I also don't know what to add
    private final String name;
    // I do this here because a player, was it a human or a computer, must have a Robot against it.
    // Hope it works really
    private final Robot robot;
    //TODO: Add a move or lastMove or something please someone else do this why im a having a breakdown
    // you didnt add any. Fine! i will do it myself.
    private Move latestMove;
    // Those are like the comments you in the windows source code.


    public Player(String name) {
        this.name = name;
        this.robot = new Robot();
    }

    public String getName() {
        return name;
    }

    public Robot getRobot() {
        return robot;
    }

    public Move getLatestMove() {
        return latestMove;
    }

    public void setLatestMove(Move latestMove) {
        this.latestMove = latestMove;
    }
}
