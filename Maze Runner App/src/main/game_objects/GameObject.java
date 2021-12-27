package main.game_objects;

/**
 * GameObject is the abstract base class for all game objects.
 * This class encapsulates the icon in character and the {Position} of a game object.
 *
 * @author Ghazi Suliyanto
 */
public abstract class GameObject {

    private final char icon;
    private Position position;

    /**
     * @param icon     the icon to represent this game object
     * @param position the {Position} of this game object in the map
     */
    GameObject(char icon, Position position) {
        this.icon = icon;
        this.position = position;
    }

    /**
     * Returns the {icon} of this game object.
     *
     * @return the game object's {icon}
     */
    public char getIcon() {
        return icon;
    }

    /**
     * Returns the {position} of this game object.
     *
     * @return the game object's {position}
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Returns the x-coordinate of this game object's {Position}
     *
     * @return the game object's x-coordinate
     */
    public int getX() {
        return position.getX();
    }

    /**
     * Sets the x-coordinate of this game object to the specified x-coordinate.
     *
     * @param x the game object's x-coordinate
     */
    void setX(int x) {
        position = new Position(x, position.getY());
    }

    /**
     * Returns the y-coordinate of this game object's {Position}
     *
     * @return the game object's y-coordinate
     */
    public int getY() {
        return position.getY();
    }

    /**
     * Sets the y-coordinate of this game object to the specified y-coordinate.
     *
     * @param y the game object's y-coordinate
     */
    void setY(int y) {
        position = new Position(position.getX(), y);
    }

    /**
     * Returns the distance between the this game object and the specified game object.
     *
     * @param obj the {GameObject} to find the distance between
     * @return the distance between these two game objects
     */
    public double distanceTo(GameObject obj) {
        return Math.sqrt(Math.pow(((this.getX() - obj.getX()) / 4.0), 2)
                + Math.pow(((this.getY() - obj.getY()) / 2.0), 2));
    }
}
