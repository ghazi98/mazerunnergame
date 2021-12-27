package main.game_objects;

/**
 * A class representing the 'player' of this game.
 *
 * @author Ghazi Suliyanto
 */
public class Player extends GameObject implements Movable {

    public static final int INITIAL_HEALTH_LEVEL = 250;
    private static final char DEFAULT_ICON = 'C';
    private static final int INITIAL_VISIBILITY = 2;
    private int visibility;
    private int healthLevel;
    private boolean hasTorch;

    /**
     * @param position the {Position} of this game object
     */
    public Player(Position position) {
        super(DEFAULT_ICON, position);
        this.visibility = INITIAL_VISIBILITY;
        this.healthLevel = INITIAL_HEALTH_LEVEL;
        this.hasTorch = false;
    }

    /**
     * Returns the {visibility} of this Player object.
     * Visibility is the number of blocks that is not covered up and is visible to the player.
     *
     * @return the {visibility} of this Player object
     */
    public int getVisibility() {
        return visibility;
    }

    /**
     * Returns the {healthLevel} of this Player object.
     *
     * @return the {healthLevel} of this Player object
     */
    public int getHealthLevel() {
        return healthLevel;
    }

    /**
     * Reduces the {healthLevel} of this Player object.
     *
     * @param value the value to be reduced
     */
    public void reduceHealthLevelBy(int value) {
        healthLevel -= value;
    }

    /**
     * Returns true if this Player object's {healthLevel} is less than or equals to zero.
     *
     * @return true if {healthLevel} is less than or equals to zero, false otherwise
     */
    public boolean isDead() {
        return healthLevel <= 0;
    }

    /**
     * Returns true if the player has reached a torch before.
     *
     * @return true if the player has torch, false otherwise
     */
    public boolean hasTorch() {
        return hasTorch;
    }

    /**
     * Sets {hasTorch} to true and increase this Player object's {visibility}.
     */
    public void foundTorch() {
        hasTorch = true;
        visibility += Torch.VISIBILITY_BOOST;
    }

    /**
     * Changes this Player object's Position based on the specified direction
     *
     * @param direction the direction to move in integer
     */
    @Override
    public void move(int direction) {
        switch (direction) {
            case DIRECTION_UP:
                this.setY(this.getY() - 2);
                break;
            case DIRECTION_DOWN:
                this.setY(this.getY() + 2);
                break;
            case DIRECTION_LEFT:
                this.setX(this.getX() - 4);
                break;
            case DIRECTION_RIGHT:
                this.setX(this.getX() + 4);
                break;
            default:
                break;
        }
    }
}
