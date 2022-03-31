package peoplesoft.commons.core;

import peoplesoft.model.util.ID;

/**
 * Class to generate unique person ids.
 */
public class PersonIdFactory {
    private static int id = 0;

    /**
     * Returns a unique person id.
     *
     * @return JobId.
     */
    // TODO: currently missing functionality with serdes
    public static ID nextId() {
        return new ID(++id);
    }

    /**
     * Sets the current id.
     *
     * @param id To set.
     */
    public static void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("id should not be negative");
        }
        PersonIdFactory.id = id;
    }

    /**
     * Returns the current id.
     *
     * @return Id.
     */
    public static int getId() {
        return id;
    }
}