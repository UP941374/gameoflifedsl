/**
 * generated by Xtext 2.28.0
 */
package goldsl.tasksDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see goldsl.tasksDSL.TasksDSLPackage#getDirection()
 * @model
 * @generated
 */
public enum Direction implements Enumerator
{
  /**
   * The '<em><b>NORTH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NORTH_VALUE
   * @generated
   * @ordered
   */
  NORTH(0, "NORTH", "north"),

  /**
   * The '<em><b>EAST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EAST_VALUE
   * @generated
   * @ordered
   */
  EAST(1, "EAST", "east"),

  /**
   * The '<em><b>SOUTH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOUTH_VALUE
   * @generated
   * @ordered
   */
  SOUTH(2, "SOUTH", "south"),

  /**
   * The '<em><b>WEST</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEST_VALUE
   * @generated
   * @ordered
   */
  WEST(3, "WEST", "west");

  /**
   * The '<em><b>NORTH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NORTH
   * @model literal="north"
   * @generated
   * @ordered
   */
  public static final int NORTH_VALUE = 0;

  /**
   * The '<em><b>EAST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EAST
   * @model literal="east"
   * @generated
   * @ordered
   */
  public static final int EAST_VALUE = 1;

  /**
   * The '<em><b>SOUTH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SOUTH
   * @model literal="south"
   * @generated
   * @ordered
   */
  public static final int SOUTH_VALUE = 2;

  /**
   * The '<em><b>WEST</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEST
   * @model literal="west"
   * @generated
   * @ordered
   */
  public static final int WEST_VALUE = 3;

  /**
   * An array of all the '<em><b>Direction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Direction[] VALUES_ARRAY =
    new Direction[]
    {
      NORTH,
      EAST,
      SOUTH,
      WEST,
    };

  /**
   * A public read-only list of all the '<em><b>Direction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Direction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Direction</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Direction get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Direction result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Direction</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Direction getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Direction result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Direction</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Direction get(int value)
  {
    switch (value)
    {
      case NORTH_VALUE: return NORTH;
      case EAST_VALUE: return EAST;
      case SOUTH_VALUE: return SOUTH;
      case WEST_VALUE: return WEST;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Direction(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Direction
