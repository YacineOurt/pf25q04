package TTTGUI;

/**
 * This enum is used by:
 * 1. Player: takes value of CROSS or NOUGHT
 * 2. TTT.Cell content: takes value of CROSS, NOUGHT, or NO_SEED.
 *
 * Ideally, we should define two enums with inheritance, which is,
 *  however, not supported.
 */
public enum Seed {   // to save as "TTT.Seed.java"
    CROSS, NOUGHT, NO_SEED
}
