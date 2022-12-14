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
 * A representation of the literals of the enumeration '<em><b>Rule Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see goldsl.tasksDSL.TasksDSLPackage#getRuleType()
 * @model
 * @generated
 */
public enum RuleType implements Enumerator
{
  /**
   * The '<em><b>COME ALIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COME_ALIVE_VALUE
   * @generated
   * @ordered
   */
  COME_ALIVE(0, "COME_ALIVE", "come_alive"),

  /**
   * The '<em><b>STAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STAY_VALUE
   * @generated
   * @ordered
   */
  STAY(1, "STAY", "stay"),

  /**
   * The '<em><b>DIE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIE_VALUE
   * @generated
   * @ordered
   */
  DIE(2, "DIE", "die");

  /**
   * The '<em><b>COME ALIVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COME_ALIVE
   * @model literal="come_alive"
   * @generated
   * @ordered
   */
  public static final int COME_ALIVE_VALUE = 0;

  /**
   * The '<em><b>STAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STAY
   * @model literal="stay"
   * @generated
   * @ordered
   */
  public static final int STAY_VALUE = 1;

  /**
   * The '<em><b>DIE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIE
   * @model literal="die"
   * @generated
   * @ordered
   */
  public static final int DIE_VALUE = 2;

  /**
   * An array of all the '<em><b>Rule Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RuleType[] VALUES_ARRAY =
    new RuleType[]
    {
      COME_ALIVE,
      STAY,
      DIE,
    };

  /**
   * A public read-only list of all the '<em><b>Rule Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RuleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Rule Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RuleType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RuleType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Rule Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RuleType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RuleType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Rule Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RuleType get(int value)
  {
    switch (value)
    {
      case COME_ALIVE_VALUE: return COME_ALIVE;
      case STAY_VALUE: return STAY;
      case DIE_VALUE: return DIE;
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
  private RuleType(int value, String name, String literal)
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
  
} //RuleType
