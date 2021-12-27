package main.game_objects;

/**
 * A class representing the 'torch' game object.
 *
 * @author Ghazi Suliyanto
 */
public class Torch extends GameObject {

    static final int VISIBILITY_BOOST = 2;
    private static final char DEFAULT_ICON = '%';

    /**
     * @param position the {Position} of this game object
     */
    public Torch(Position position) {
        super(DEFAULT_ICON, position);
    }

}

